package Shapes;

public class Cone extends Triangle{

    //base == radius of the cone
    public Cone(double height, double base){
        super(height, base);
    }

    //base == radius of the cone
    public double calArea(){
        return Math.PI * super.base * (super.base + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.base, 2)));
    }
}
