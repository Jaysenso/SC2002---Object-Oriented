import java.util.*;
import Shapes.*;

public class Shape2DApp {
    public static void main(String[] args){

        ArrayList<Shape> shapeList = new ArrayList<Shape>(); //stores our shape objects in an arrayList for calculation later
        Scanner sc = new Scanner(System.in);
        Shape shape = null;
        int numOfShapes;
        int choice;
        boolean updateFlag;
        do {
            System.out.println("-------------------------------------");
            System.out.print("Enter the total number of shapes : ");
            numOfShapes = sc.nextInt();
        }while(numOfShapes <= 0);

        for(int i = 0; i < numOfShapes; i++) {

            updateFlag = false;

            while (!updateFlag) {
                System.out.println("\nChoose the shape:\n1.Square\n2.Rectangle\n3.Circle\n4.Triangle");
                System.out.print("Enter Choice :");
                choice = sc.nextInt();

                switch (choice) {

                    //Square
                    case 1:
                        System.out.print("Enter length of the side: ");
                        double side = sc.nextDouble();
                        //error handling
                        if (side <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Square(side);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Rectangle
                    case 2:
                        System.out.print("Enter Height : ");
                        double rectHeight = sc.nextDouble();
                        System.out.print("Enter Breadth : ");
                        double breadth = sc.nextDouble();
                        //error handling
                        if (rectHeight <= 0 || breadth <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Rectangle(rectHeight, breadth);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Circle
                    case 3:
                        System.out.print("Enter Radius: ");
                        double radius = sc.nextDouble();
                        //error handling
                        if (radius <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Circle(radius);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Triangle
                    case 4:
                        System.out.print("Enter Height : ");
                        double circHeight = sc.nextDouble();
                        System.out.print("Enter Base : ");
                        double base = sc.nextDouble();
                        //error handling
                        if (circHeight <= 0 || base <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Triangle(circHeight, base);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    default:
                        break;
                }
            }
        }

        //Area calculation (area / volume)
        String areaChoice = null;
        do{
            System.out.println("\nCalculate Area? y/n");
            areaChoice = sc.next();

            if(areaChoice.equals("y")){
                double area = 0;
                for(int i  = 0; i < numOfShapes; i++){
                    //Error handling 
                    if(shapeList.get(i).calArea() == -1){
                        System.out.println("Error Exception!");
                        break;
                    }
                    area += shapeList.get(i).calArea();
                }
                System.out.printf("Total Area is %.2f",area);
            }
        }while(!areaChoice.equals("y"));
    }

}
