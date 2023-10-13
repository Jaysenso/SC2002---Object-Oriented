package Shapes;

public class Sphere extends Circle {

    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double calArea(){
        return ((4 * Math.PI * Math.pow(this.radius,2)));
    }
}
