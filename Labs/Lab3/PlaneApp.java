
import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;
        boolean bySeatId;
        Plane plane = new Plane();

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        do{

            System.out.println();
            System.out.printf("Enter the number of your choice: ");
            userChoice = sc.nextInt();
            
            switch(userChoice){
                case 1: 
                    plane.showNumEmptySeats();
                    break;

                case 2:
                    plane.showEmptySeats();
                    break;

                case 3:
                    bySeatId = true;
                    plane.showAssignedSeats(bySeatId);
                    break;

                case 4:
                    bySeatId = false;
                    plane.showAssignedSeats(bySeatId);
                    break;

                case 5: 
                    int seat_id, cust_id;
                    System.out.println("Assigning Seat ..");

                    System.out.printf("Please enter SeatID: ");
                    seat_id = sc.nextInt();
                    System.out.printf("Please enter Customer ID: ");
                    cust_id = sc.nextInt();
                    plane.assignSeat(seat_id, cust_id);
                    break;

                case 6:
                    System.out.printf("Enter SeatID to unassign customer from: ");
                    seat_id = sc.nextInt();
                    plane.unAssignSeat(seat_id);
                    break;
                    
                default:
                    break;
            }

        }while(userChoice != 7);
    }
}
