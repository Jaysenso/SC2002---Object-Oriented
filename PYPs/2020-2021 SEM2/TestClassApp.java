

public class TestClassApp {
    public static void main(String[] args){
        TestClass.greetings();
        TestClass myProduct = new TestClass("Amazing");
        myProduct.print();
        myProduct.update(999.99, "AmazingII");
        myProduct.print();
        myProduct.printNumberOfProduct();
        TestClass tomProduct = new TestClass("TomProduct");
        tomProduct.printNumberOfProduct();
    }
}
