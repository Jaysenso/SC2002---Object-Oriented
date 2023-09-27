
import java.util.*;

public class MobilePhoneApplication {

    public static void main(String[] args){

        // MobilePhone myPhone = new MobilePhone();
        // myPhone.printContent();
        // myPhone.setSize(10);

        // FiveGPhone johnPhone = new FiveGPhone("John", "White", 7.0, 0.1 , 10.0);
        //     System.out.println("The  owner is: " + johnPhone.getOwner());
        //     johnPhone.sendSMS("Jane", "Will you go to lunch with me?");
        //     johnPhone.sendSMS("Jane");

            IntPhone phone = new TwoGPhone("Tom", "black",5.0);
            call(phone);

            phone = new FiveGPhone("John", "white", 7.0, 0.1, 10.0);
            call(phone);

            phone =  new SixGPhone("Jane", "red", 9.0);
            call(phone);
    }

    public static void call(IntPhone phone){
        phone.ring();
    }
}











        // System.out.println("My phone screen Size : "+ myPhone.getSize());
        
        // App app = new App("Facebook",0.0);
        // App app1 = new App("weChat", 0.0);
        // App app2 = new App("Whatsapp", 0.0);
        // App app3 = new App("Angry bird", 2.0);

        // ArrayList<App> appStore = new ArrayList<App>();
        // appStore.add(app1);
        // appStore.add(app2);
        // appStore.add(app3);

        // MobilePhone johnPhone = new MobilePhone("John", "Red", 7.0, app, appStore);
        // //johnPhone.getApp().print();
        // johnPhone.getAppStore().get(2).print();
    
        //override the default owner 
        //myPhone.setOwner("Jane");
        //myPhone.sendSMS("tom", "hi");
        
        //johnPhone.sendSMS("Jane", "hi");

        //System.out.println("the current owner is " + myPhone.getOwner());

        //System.out.println("the number of sms sent so far is : " + myPhone.getNum());

        //MobilePhone copyPhone = myPhone.clonePhone();
        //myPhone.changeName();
        //myPhone.printContent();    
        //copyPhone.printContent();
        //MobilePhone yourPhone = new MobilePhone("john", "red" , 7.0);
        //yourPhone.printContent();
