public class PlaneSeat{
    
    private int seatId;
    private boolean assigned;
    private int customerId;

    //initialize constructor variables to all 0
    public PlaneSeat(int seat_id){
        this.seatId = seat_id;
        assigned = false;
        customerId = -1;
    }
    //getters
    public int getSeatID(){
        return this.seatId;
    }
    public int getCustomerID(){
        return this.customerId;
    }
    public boolean isOccupied(){
        return this.assigned;
    }
    //take in cust_id and assign it 
    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }
    //unAssign reinitialize all the variables
    public void unAssign(){
        this.assigned = false;
        this.customerId = -1;
    }
}
