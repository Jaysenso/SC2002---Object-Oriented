package Shapes;

public class Cylinder extends Rectangle{
    //breadth == radius (cylinder is just a rectangle that spans 360* degree)
    //length == height
    public Cylinder(double height, double radius){
        super(height, radius);
    }

    @Override
    public double calArea() {
        return ((2 * Math.PI * super.breadth * super.length) + (2 * Math.PI * Math.pow(super.breadth,2)));
    }

    public double getBreadth(){return this.breadth;}
    public double getLength(){return this.length;}
}
