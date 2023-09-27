public class SixGPhone extends MobilePhone implements IntPhone {
    
    public SixGPhone(String owner, String color, double screenSize){
        super(owner, color, screenSize);
    }
    public void ring(){
        System.out.println("Play a video");
    }
}
