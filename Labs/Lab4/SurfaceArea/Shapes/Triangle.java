package Shapes;

public class Triangle implements Shape{
    
    protected double height;
    protected double base;

    public double calArea(){
        return(0.5 * this.base * this.height);
    }
    
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }



    public double getHeight(){return this.height;}
    public double getBase(){return this.base;}

}

