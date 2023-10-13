package Shapes;

public class Rectangle implements Shape{
    
    protected double length;
    protected double breadth;

    public double calArea(){
        return (this.length * this.breadth);
    }
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }


    //getter methods
    public double getlength(){return this.length;}
    public double getbreadth(){return this.breadth;}
}
