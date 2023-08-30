
import java.util.Scanner;
import java.util.Random;

public class Lab2p1{
    public static void main(String[] args){
        int choice, answer;
        int m, n;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Perform the following methods: ");
            System.out.println("1: Multiplication test");
            System.out.println("2: Quotient using division by subtraction");
            System.out.println("3. Remainder using division by substraction");
            System.out.println("4: Count the nubmer of digits");
            System.out.println("5: Position of a digit");
            System.out.println("6: Extract all odd digits");
            System.out.println("7: Quit");

            choice = sc.nextInt();

            switch(choice){
                case 1 : 
                    mulTest();
                    break;
                case 2:
                    System.out.printf("m = ");
                    m = sc.nextInt();
                    System.out.printf("n = ");
                    n = sc.nextInt();

                    int quotient = divide(m, n);
                    System.out.println(m +"/" + n + " = "  + quotient);
                    System.out.printf("\n");
                    break;

                case 3:
                    System.out.printf("m = ");
                    m = sc.nextInt();
                    System.out.printf("n = ");
                    n = sc.nextInt();
                    
                    int remainder = modulus(m, n);
                    System.out.println(m +" % " + n + " = "  + remainder + "\n");
                    break;
                    
                case 4:
                    System.out.printf("n = ");
                    n = sc.nextInt();

                    if(n < 1){
                        System.out.println("Error input!!");
                        break;
                    }
                    
                    int count = countDigits(n);
                    System.out.println("n : " + n  + " - count = " + count + "\n");

                    break;

                case 5:
                    System.out.printf("n : ");
                    n = sc.nextInt();
                    System.out.printf("digit : ");
                    int digit = sc.nextInt();

                    int position = position(n, digit);
                    System.out.println("position = " + position);

                    break;
                
                case 6:
                    System.out.printf("n : ");
                    n = sc.nextInt();

                    if(n <= 0){
                        System.out.println("Error input!!");
                        break;
                    }

                    Long oddDigits = extractOddDigits(n);
                    System.out.println("oddDigits = " + oddDigits);
                    break;

                default:
                    break;
                }

        }while(choice < 7); 
    }

    public static void mulTest(){
        Random rand = new Random();
        int score = 0;
        int num1, num2, answer;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            num1 = rand.nextInt(9 - 1) + 1;
            num2 = rand.nextInt(9 - 1) + 1;
            System.out.println("How much is " + num1 + " times " + num2 + " ?");
            
            answer = sc.nextInt();
            if(answer == num1 * num2)
                score++;
        }
        System.out.println(score + " out of 5 are correct.");
    }

    public static int divide(int m, int n){
        int dividend = m;
        int quotient = 0;

        while(dividend > 0){

            dividend -= n;
            //only increment counter if its a legal subtraction
            if(dividend > 0)
                quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n){
        int temp;

        while(true){
            temp = m - n;
            if(temp < 0)
                break;
            else   
                m -= n;
        }
        return m;
    }

    public static int countDigits(int n){
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    //first appearance of the digit from the back to front
    public static int position(int n, int digit){
        int position = 1;
        int lastDigit;

        while(n > 0){
            lastDigit = n % 10;

            //If the last digit == digit, then we return the current position
            if(lastDigit == digit) {
                return position;
            }
            position++;
            n/=10;
        }

        return -1;
    }
    public static long extractOddDigits(long n){
        String oddDigits = "";
        Long digit;

        while(n > 0){
            digit = n % 10;

            if(digit % 2 != 0)
                oddDigits = digit + oddDigits;
            
            n /= 10;
        }

        if(oddDigits != "")
            return Long.valueOf(oddDigits);

        return -1;
    }
}