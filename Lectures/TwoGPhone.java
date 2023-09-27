public class TwoGPhone extends MobilePhone implements IntPhone{
    
    public TwoGPhone(String owner, String color, double screenSize){
        super(owner, color, screenSize);

    }
    public void ring(){
        System.out.println("ring, ring, ring");
    }
}
