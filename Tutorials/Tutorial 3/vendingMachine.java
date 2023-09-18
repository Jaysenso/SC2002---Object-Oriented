
import java.util.Scanner;
public class vendingMachine{

    public vendingMachine(){
        
    }

    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)      |");
        System.out.println("|2. Buy Coke ($1.00)      |");
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

    public double insertCoins(double drinkCost){

        double amount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input    |");
        System.out.println("==================================");
   
        //keep calling for user input till amount >= drinkCost
       do{
            if(amount == drinkCost)
                break; 

            String coinInput = sc.nextLine();
            switch(coinInput){
                case "Q" : case "q" : amount += 0.10; break;
                case "T" : case "t" : amount += 0.20; break;
                case "F" : case "f" : amount += 0.50; break;
                case "N" : case "n" : amount += 1.00; break;
                default: break;
            }
            System.out.printf("Coins inserted : %.2f\n", amount);
        } while(amount <= drinkCost);
        return amount;
    }

    public void checkChange(double amount, double drinkCost){
        double change = amount - drinkCost;
        //error handling 
        if(change < 0)
            return;
        System.out.printf("Change: $%.2f\n",change);
    }

    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank You !!");
    }
}