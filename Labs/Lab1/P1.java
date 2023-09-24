import java.util.Scanner;

public class P1 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        while(true){
            String choices = userInput.nextLine();
            if(choices.equals("end")){
                break;
            }
            switch(choices){
                case "a":
                    System.out.println("Action movie fan\n");
                    break;
                case "c":
                    System.out.println("Comedy movie fan\n");
                    break;
                case "d":
                    System.out.println("Drama movie fan\n");
                    break;
                default:
                    System.out.println("Invalid choice\n");
                    break;
            }

        }       
    }
}