public class Rectangle { //keyword
    //instance variables
    private double width; //private Type instance_Variable_Name;
    private double height; //private Type instance_Variable_Name;

    //overloaded constructor 
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //overridden default constructor
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    //instance methods
    public double findArea(double width, double height){ //private Return_Type Method_Name(Parameter_List)
        return width * height;
    }
    public double findPerimeter(){ //public Return_Type Method_Name(Parameter_List)
        return (this.width + this.height) * 2;
    }

    public void print(){
        System.out.println("The area of rectangle is "+ this.findArea(width, height) );
        System.out.println("The ")
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }

    @Override
    public String toString(){
        return "Width:" + this.width + "Height:" + "hi" + this.height;
    }
}