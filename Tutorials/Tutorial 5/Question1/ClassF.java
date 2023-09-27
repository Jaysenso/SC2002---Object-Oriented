public class ClassF extends ClassE{
    

    public ClassF(){

    }
    public void print(int x, String y){
        System.out.println(x + " " +  y);
        System.out.println("overwritten from classA");
    }

    public void print(int x){
        System.out.println(x); 
        System.out.println("Class F");
    }
}
