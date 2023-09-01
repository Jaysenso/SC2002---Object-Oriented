public class Circle{
    private double radius; //radius of circle
    private static final double PI = 3.14159;
    
    public Circle(double rad){
        this.radius = rad;
    }
    //setter method
    public void setRadius(double rad){
        if(rad > 0)
            this.radius = rad;
    }
    //getter method
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return(PI * (this.radius * this.radius));
    }
    public double circumference(){
        return(2*PI*this.radius);
    }
    public void printArea(){
        System.out.println("Area: " + area());
    }

    public void printCircumference(){
        System.out.println("Circumference: " + circumference());
    }
}
