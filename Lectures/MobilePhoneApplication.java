public class MobilePhone {

    public static final double MAX_SCREEN_SIZE = 8.0;

    public String owner;
    private String color;
    private double screenSize;
    private int num;

    private static int numofSMS;

    //overloading constructor
    public MobilePhone(){
        //owner = "defaultOwner";
        //color = "white";
        //screenSize = 5.0;
        this("default Owner", "white", 5.0);
    }

    public MobilePhone(String owner, String color, double screenSize){
        this.owner = owner;
        this.color = color;
        this.screenSize = screenSize;
    }
    //getter 
    public String getOwner(){
        return owner;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return screenSize;
    }
    public static int getNumOfSMS(){
        return numofSMS;
    }
    public int getNum(){
        return num;
    }
    
    //setter
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSize(double screenSize){
        if(screenSize > MAX_SCREEN_SIZE)
            this.screenSize = MAX_SCREEN_SIZE;
        else{
            this.screenSize = screenSize;
        }
    }

    public void ring(){
        System.out.println("ring ring ring");
    }

    public String sendSMS(String receiver, String message){
        numofSMS++;
        num++;
        System.out.println("hi" + receiver + " " + message);
        return "Successful";
    }

    public void printContent(){
        System.out.println("the owner is " + owner + "; the color is " + color + "; the screen size is: " + screenSize);
    }

    public MobilePhone clonePhone(){
        return new MobilePhone(owner, color, screenSize);
    }

    public void changeName(){
        this.owner = "tom";
    }
}
