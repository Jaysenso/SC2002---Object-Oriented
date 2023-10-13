package Shapes;

public class Circle implements Shape{

    protected double radius;

    public double calArea(){
        return ((Math.PI * Math.pow(this.radius,2)));
    }
    
    public Circle(double radius){
        if(radius < 0){
            System.out.println("Invalid Radius");
            return;
        }

        this.radius = radius;
    }



    public double getRadius(){return this.radius;}
    
}
