package Shapes;

public class Pyramid extends Triangle{

    public Pyramid(double height, double base){
        super(height, base);
    }

    public double calArea(){
        double baseArea = Math.pow(super.base,2);
        double triangleArea = super.calArea();
        return (baseArea + (4 * triangleArea));
    }
}
