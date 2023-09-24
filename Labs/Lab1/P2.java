import java.util.Scanner;

/*
 * merit score:
 * if merit score < 10 == grade C
 * if merit score < 20 == grade b
 * if merit score >= 20 == grade a
 */



public class P2 {
    public static void main(String[] args){

        //instantiate scanner object
        Scanner userInput = new Scanner(System.in);

        while(true){

            
            System.out.println("Enter salary:");
            int salary = userInput.nextInt();

            if(salary == -1){
                break;
            }
            
            System.out.println("Enter merit:");
            int merit = userInput.nextInt();
        

            String grade = calculateGrade(salary, merit);
            System.out.println("merit : " + grade);
            }

        }

    public static String calculateGrade(int salary, int meritPoint){
        String grade = "";
        if(salary >= 700 && salary <= 899){
            if(meritPoint < 20)
                grade = "B";
            else 
                grade = "A";
        }

        else if(salary >= 600 && salary <= 799){
            if(meritPoint < 10)
                grade = "C";
            else 
                grade = "B";
        }

        else if(salary >= 500 && salary <= 649){
            grade = "C";
        }
        return grade;
    }

}