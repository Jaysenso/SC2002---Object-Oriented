
public class TestQ {
    public static void main(String[] args){
        ClassX x1 = new ClassZ();
        x1.compare(10, 10);
        ClassY y1 = (ClassY)x1;
        y1.compare(10, 20);
    }
}
