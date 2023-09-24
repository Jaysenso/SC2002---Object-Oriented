import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        int choice = 3;
        int starting, ending, increment;
        Scanner userInput = new Scanner(System.in);

        do{
        System.out.println("starting: ending: increment: ");
        starting = userInput.nextInt(); // starting == usDollars
        ending = userInput.nextInt();
        increment = userInput.nextInt();
        } 
        //ensure no illegal user inputs
        while(starting < 0 || ending < 0 || increment <= 0);  

        System.out.println("US$          S$");
        System.out.println("---------------");
        
        //functions selector
        if(choice == 1)
            forLoopPrint(starting, ending, increment);
        else if(choice == 2)
            whileLoopPrint(starting, ending, increment);
        else if(choice == 3)
            doWhileLoopPrint(starting, ending, increment);

    }

    public static double currencyConversion(int starting){
       
        double sgDollars;

        sgDollars = starting * 1.82;
        return sgDollars;
    }

    public static void forLoopPrint(int starting, int ending, int increment){

        double sgDollars;

        for(int i = starting; i <= ending; i += increment){
            sgDollars = currencyConversion(i);
            System.out.println(i + "\t" + sgDollars);
        }
    }

    public static void whileLoopPrint(int starting, int ending, int increment){
        
        double sgDollars;
        int i = starting;

        while(i <= ending){
            sgDollars = currencyConversion(i);
            System.out.println(i + "\t" + sgDollars);
            i+= increment;
        }
    }

    public static void doWhileLoopPrint(int starting, int ending, int increment){
        double sgDollars;
        int i = starting;

        do{
            sgDollars = currencyConversion(i);
            System.out.println(i + "\t" + sgDollars);
            i+= increment;
        }while(i <= ending);
    }
}

