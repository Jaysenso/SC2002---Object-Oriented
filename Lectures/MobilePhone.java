import java.util.*;

public abstract class MobilePhone{

    public static final double MAX_SCREEN_SIZE = 8.0;

    protected String owner;
    protected String color;
    protected double screenSize;
    private int num;
    private App app;
    private ArrayList<App> appStore;

    private static int numofSMS;

    //overloading constructor
    public MobilePhone(){
        owner = "defaultOwner";
        color = "white";
        screenSize = 5.0;
        //this("default Owner", "white", 5.0);
    }

    public MobilePhone(String owner, String color, double screenSize){ //App app, ArrayList<App> appStore){
        this.owner = owner;
        this.color = color;
        this.screenSize = screenSize;
        // this.app = app;
        // this.appStore = appStore;
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
    public App getApp(){
        return app;
    }
    public ArrayList<App> getAppStore(){
        return appStore;
    }
    
    public void setAppstore(ArrayList<App> appStore){
        this.appStore = appStore;
    }
    public void setApp(App app){
        this.app = app;
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

    public abstract void ring();
    

    public String sendSMS(String receiver, String message){
        numofSMS++;
        num++;
        System.out.println("hi " + receiver + " " + message);
        return "Successful";
    }

    public void printContent(){
        System.out.println("the owner is " + owner + "; the color is " + color + "; the screen size is: " + screenSize);
    }

    public MobilePhone clonePhone(){
        return new MobilePhone(owner, color, screenSize);// app, appStore);
    }

    public void changeName(){
        this.owner = "tom";
    }
}
