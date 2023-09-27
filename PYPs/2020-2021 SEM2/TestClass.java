public class TestClass {
    private double price;
    private String name;
    static int numberOfProduct = 0;

    public TestClass(String name){
        this.name = name;
        numberOfProduct++;
    }

    public static void greetings(){
        System.out.println("Hello welcome to our product line.");
    }
    public void update(double price, String name){
        this.price = price;
        this.name = name;
    }
    
    public void print(){
        System.out.printf("%s:costs S$%.2f\n",this.name,this.price);
    }

    public void printNumberOfProduct(){
        System.out.println("number = " + numberOfProduct);
    }
}
