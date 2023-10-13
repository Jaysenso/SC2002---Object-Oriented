package Shapes;

public class Pyramid extends Triangle{
    
    private double baseSide;

    public Pyramid(double height, double base){
        super(height, base);
    }

    public double calArea(){
        double baseArea = baseSide * baseSide;
        double triangleArea = super.calArea();
        return (baseArea + (4 * triangleArea));
    }
}
