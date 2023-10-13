package Shapes;

public class Square implements Shape{
    
    private double side;
    
    public double calArea(){
        return (this.side * this.side);
    }

    public Square(double side){
        this.side = side;
    }



    //getter methods
    public double getSide(){return side;}
}
