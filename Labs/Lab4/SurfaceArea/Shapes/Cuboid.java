package Shapes;

public class Cuboid extends Rectangle{
    
    private double height;

    public Cuboid(double height, double breadth, double length){
        super(length, breadth);
        this.height = height;
    }

    public double calArea(){
        double lateralArea = 2 * (length * height + length * breadth);
        double baseArea = super.calArea();
        return (2 * baseArea + lateralArea);
    }
}
