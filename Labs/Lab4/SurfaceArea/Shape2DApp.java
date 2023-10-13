import java.util.*;
import Shapes.*;

public class Shape2DApp {
    public static void main(String[] args){

        ArrayList<Shape> shapeList = new ArrayList<Shape>(); //stores our shape objects in an arrayList for calculation later
        Scanner sc = new Scanner(System.in);
        int numOfShapes;
        int choice;

        System.out.println("-------------------------------------");
        System.out.printf("Enter the total number of shapes : ");
        numOfShapes = sc.nextInt();

        for(int i = 0; i < numOfShapes; i++){
            System.out.println("\nChoose the shape:\n1.Square\n2.Rectangle\n3.Circle\n4.Triangle");
            System.out.println("Enter Choice :");
            choice = sc.nextInt();
            switch(choice){
                //Square
                case 1: 
                    System.out.printf("Enter length of the side: ");
                    double side = sc.nextDouble();

                    Shape square = new Square(side);
                    shapeList.add(square);
                    break;

                //Rectangle    
                case 2:
                    System.out.printf("Enter Height : ");
                    double rectHeight = sc.nextDouble();
                    System.out.println();
                    System.out.printf("Enter Breadth : ");
                    double breadth = sc.nextDouble();

                    Shape rectangle = new Rectangle(rectHeight, breadth);
                    shapeList.add(rectangle);
                    break;

                //Circle
                case 3:
                    System.out.printf("Enter Radius: ");
                    double radius = sc.nextDouble();
                    
                    Shape circle = new Circle(radius);
                    shapeList.add(circle);
                    break;

                //Triangle
                case 4:
                    System.out.printf("Enter Height : ");
                    double circHeight = sc.nextDouble();
                    System.out.println();
                    System.out.printf("Enter Base : ");
                    double base = sc.nextDouble();

                    Shape triangle = new Triangle(circHeight, base);
                    shapeList.add(triangle);
                    break;
                default:
                    break;
            }
        }
        //calculation (area / volume)
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

    //we downcast it and calculate using its declared implementation
    public double calArea(Shape shape){
        if(shape instanceof Square){
            Square square = (Square) shape;
            return(square.calArea());
        }
        else if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            return(circle.calArea());
        }
        else if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return(rectangle.calArea());
        }
        else if(shape instanceof Triangle){
            Triangle triangle = (Triangle) shape;
            return(triangle.calArea());
        }

        return -1;
    }
}
