
import java.util.Scanner;
public class vendingMachine{

    public void vendingMachine(){
        
    }


    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00) |");
        System.out.println("|2. Buy Coke ($1.00) |");
        System.out.println("|3. Buy Green Tea ($5.00) |");
        System.out.println("|============================");

        do{
            System.out.println("Please enter selection :");
            selection = sc.nextInt();
        }while (selection < 1 || selection > 3);

        if(selection == 1)
            return 3.00;
        else if(selection == 2)
            return 1.00;
        else if(selection == 3)
            return 5.00;

    }
}