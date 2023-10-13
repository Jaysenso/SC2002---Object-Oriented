package Shapes;

public class Cube extends Square {
    
    public Cube(double side){
        super(side);
    }

    public double calArea(){
        double baseArea = super.calArea();
        return(6 * baseArea);
    }
}
