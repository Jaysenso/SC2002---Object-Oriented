import java.util.Scanner;

public class CircleApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        Circle circle = null; //initialize circle obect

        do{          
        System.out.println("==== Circle Computation ====");
        System.out.println("|1. Create a new circle\t   |");
        System.out.println("|2. Print Area \t           |");
        System.out.println("|3. Print circumference    |");
        System.out.println("|4. Quit                   |");
        System.out.println("============================");
        System.out.println("Choose option (1-3) :");
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter the radius to compute the area and circumference");
                double rad = sc.nextDouble();
                if(rad > 0){//legal circle radius
                    circle = new Circle(rad);
                    System.out.println("A new circle is created");
                }
                break;
            case 2:
                System.out.println("Area of circle");
                System.out.println("Radius: " + circle.getRadius());
                circle.printArea();
                break;
            case 3:
                System.out.println("Circumference of circle");
                System.out.println("Radius: " + circle.getRadius());
                circle.printCircumference();
                break;
            case 4:
                System.out.println("Thank you!!");
                break;
            default:
                break;
        }
        }while(choice > 0 && choice < 4);
    }
}
