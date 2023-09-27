
public class Tutorial5 {
    public static void main(String[] args){

        //Qestion 1
        ClassF z = new ClassF();
        z.print(9);
        z.print(2, "cx2002");
        z.print("object");
        z.print("OODP" , "Java");
        //z.print("OODP", 2002); <- compile error

        //Question 2
        //ClassC c = new ClassD();
        //c.print("hello", "there");
        
        //ClassA a = new ClassC(); <- cannot instantiate an abstract class
        //a.print(1, "there");

        //ClassA a = new ClassF();
        //a.print("hello", "there"); <- compile error (ClassA does not have (string,string) implementation)
        
        //Question 3
        //ClassC c = new ClassD();
        //ClassE e = c; <- require explicit downcasting

        //ClassB b = new ClassE(); ClassE is not a subclass of classB

        //ClassA a = new ClassF();
        //a.print(12,"there");
        //a.print(88); <- a has been upcasted to ClassA and can only use A's implementation

        // ClassA a = new ClassC();
        // ClassG g = (ClassG)a;
        // g.print("hello");

        // ClassA a = new ClassC();
        // ClassG g = (ClassG)a;
        // g.print("hello");

        ClassA a = new ClassC();
        System.out.println(a.getClass());

        
        if((ClassC)a instanceof ClassA)
        System.out.println("A is instance of ClassA");
        ClassC f = (ClassC)a;
        f.print(88,"there");

                
    }

}
