import java.util.Scanner;

public class Diceapp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        //dice1
        while(true){
            System.out.println("Press <key> to roll the first dice");
            String readInput = sc.nextLine();

            if(!readInput.isEmpty()){
                dice1.setDiceValue();
                System.out.println("Current Value is : " + dice1.getDiceValue());
                break;
            }
        }
        
        //dice2
        while(true){
            System.out.println("Press <key> to roll the second dice");
            String readInput = sc.nextLine();

            if(!readInput.isEmpty()){
                dice2.setDiceValue();
                System.out.println("Current Value is : " + dice2.getDiceValue());  
                break;
            }
        }
        System.out.println("Your total nubmer is: " + (dice1.getDiceValue() + dice2.getDiceValue()));


    }
}

