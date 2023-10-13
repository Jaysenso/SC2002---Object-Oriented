import java.util.*;
import Shapes.*;

public class Shape3DApp {
    public static void main(String[] args){

        ArrayList<Shape> shapeList = new ArrayList<Shape>(); //stores our shape objects in an arrayList for calculation later
        Scanner sc = new Scanner(System.in);
        Shape shape = null;
        int numOfShapes;
        int choice = 0;
        boolean updateFlag; //upon successful update of dimensions, update this flag and move to next iteration, else keep looping

        System.out.println("-------------------------------------");
        System.out.print("Enter the total number of shapes : ");
        numOfShapes = sc.nextInt();

        for(int i = 0; i < numOfShapes; i++) {
            //updateFlag will be updated numOfShapes times
            updateFlag = false; //re-initialized to false after every iteration
            //updateFlag will only be updated when a valid shape object is added into the ArrayList
            while (!updateFlag) {
                    try {
                        System.out.println("\nChoose the shape:\n1.Cube\n2.Cuboid\n3.Sphere\n4.Square-based Pyramid\n5.Cone\n6.Cylinder");
                        System.out.println("Enter Choice :");
                        choice = sc.nextInt();
                    }
                    catch (InputMismatchException e){
                        throw new InputMismatchException("Invalid choice!");
                    }

                switch (choice) {
                    //Cube
                    case 1:
                        System.out.print("Enter length of the side: ");
                        double side = sc.nextDouble();

                        //error handling
                        if(side <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Cube(side);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Cuboid
                    case 2:
                        System.out.print("Enter Height : ");
                        double rectHeight = sc.nextDouble();
                        System.out.print("\nEnter Breadth : ");
                        double breadth = sc.nextDouble();
                        System.out.print("\nEnter Length : ");
                        double length = sc.nextDouble();

                        //error handling
                        if(rectHeight <= 0 || breadth <= 0 || length <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Cuboid(rectHeight, breadth, length);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Sphere
                    case 3:
                        System.out.print("Enter Radius: ");
                        double radius = sc.nextDouble();

                        //error handling
                        if(radius <= 0) {
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Sphere(radius);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Square-based Pyramid
                    case 4:
                        System.out.print("Enter Height : ");
                        double circHeight = sc.nextDouble();
                        System.out.print("\nEnter Base : ");
                        double base = sc.nextDouble();

                        if(circHeight <= 0 || base <= 0){
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Pyramid(circHeight, base);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Cone
                    case 5:
                        System.out.print("Enter Height : ");
                        double coneHeight = sc.nextDouble();
                        System.out.print("\nEnter Radius : ");
                        double coneRadius = sc.nextDouble();

                        if(coneHeight <= 0 || coneRadius <= 0){
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Cone(coneHeight, coneRadius);
                        shapeList.add(shape);
                        updateFlag = true;
                        break;

                    //Cylinder
                    case 6:
                        System.out.print("Enter Height : ");
                        double cylHeight = sc.nextDouble();
                        System.out.print("\nEnter Radius : ");
                        double cylRadius = sc.nextDouble();

                        //error handling
                        if(cylHeight <= 0 || cylRadius <= 0){
                            System.out.println("Invalid dimensions!");
                            break;
                        }
                        shape = new Cylinder(cylHeight, cylRadius);
                        shapeList.add(shape);
                        updateFlag = true;

                    default:
                        break;
                }
            }
        }

        //calculation (Calculate upon user 's request)
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

    //we downcast it and calculate using its declared implementation (this is redundant, we are not utilizing polymorphism)
//    public double calArea(Shape shape){
//        if(shape instanceof Cube){
//            Cube cube = (Cube) shape;
//            return(cube.calArea());
//        }
//        else if(shape instanceof Sphere){
//            Sphere sphere = (Sphere) shape;
//            return(sphere.calArea());
//        }
//        else if (shape instanceof Cuboid){
//            Cuboid cuboid = (Cuboid) shape;
//            return(cuboid.calArea());
//        }
//        else if(shape instanceof Pyramid){
//            Pyramid pyramid = (Pyramid) shape;
//            return(pyramid.calArea());
//        }
//        else if(shape instanceof Cone){
//            Cone cone = (Cone) shape;
//            return(cone.calArea());
//        }
//        else if(shape instanceof Cylinder){
//            Cylinder cylinder = (Cylinder) shape;
//            return(cylinder.calArea());
//        }
//
//        return -1;
//    }
}
