public class Plane {
    //instantiate array of 12 PlaneSeats objects
    final static int numOfSeats = 120;
    private static PlaneSeat[] seat = new PlaneSeat[numOfSeats];
    private static int numEmptySeat;

    public Plane(){
        //initialize the PlaneSeat array
        for(int i = 0; i < numOfSeats; i++){
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = numOfSeats;
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats(){
        int seatNumber;
        for(int i = 0; i < numOfSeats; i++){
            if(!seat[i].isOccupied()){
                seatNumber = i + 1;
                System.out.println("SeatID " + seatNumber);
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){
        //display by SeatId
        if(bySeatId == true){
            for(int i = 0; i < numOfSeats; i++){
                //to make sure that we are printing assigned seats and not empty one
                if(seat[i].getCustomerID() != -1 && seat[i].isOccupied()){
                    System.out.println("SeatID " + (seat[i].getSeatID()) +
                    " assigned to CustomerID " + seat[i].getCustomerID() + ".");
                }
            }
        }

        //display by ascending CustomerID
        if(bySeatId == false){
            PlaneSeat tempSeat;
            PlaneSeat[] tempSeatArray = new PlaneSeat[numOfSeats];
            //make a copy of all the objects in Seat array
            for(int i = 0; i < numOfSeats; i++){
                tempSeatArray[i] = seat[i];
            }

            //BubbleSort(not recommended since is O(n^2))
            for(int i = 0; i < numOfSeats - 1; i++){
                for(int j = 0; j < numOfSeats - i - 1; j++){
                    //swapping operation
                    if(tempSeatArray[j].getCustomerID() > tempSeatArray[j + 1].getCustomerID()){
                        tempSeat = tempSeatArray[j];
                        tempSeatArray[j] = tempSeatArray[j + 1];
                        tempSeatArray[j + 1] = tempSeat;
                    }
                }
            }

            //display output list (since array is already sorted, we just iterate 12 - numEmptySeats time)
            for(int i = numEmptySeat; i < numOfSeats; i++){
                if(tempSeatArray[i].isOccupied())
                    System.out.println("SeatID " + (tempSeatArray[i].getSeatID()) +
                    " assigned to CustomerID " + tempSeatArray[i].getCustomerID() + ".");
                //System.out.println(index + " " + i);
            }
        }
    }
    

    public void assignSeat(int seatId, int cust_id){
        
        if(seatId < 1 || seatId > numOfSeats){
            System.out.println("Invalid SeatId");
            return;
        }

        if(seat[seatId - 1].isOccupied() == false){
            seat[seatId - 1].assign(cust_id);
            System.out.println("Seat Assigned!");
            numEmptySeat--;
        }
        else
            System.out.println("Seat already assigned to a customer");
    }


    public void unAssignSeat(int SeatId){
        if(!seat[SeatId - 1].isOccupied()){
            System.out.println("Seat is empty");
            return;
        }
        seat[SeatId - 1].unAssign();

        if(!seat[SeatId - 1].isOccupied())
            numEmptySeat++;
            System.out.println("Seat unassigned!");
    }
}
