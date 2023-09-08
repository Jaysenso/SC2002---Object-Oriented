public class MobilePhone {
    public static void main(String[] args){

        MobilePhone myPhone = new MobilePhone();
        myPhone.printContent();
        myPhone.setSize(10);
        System.out.println("My phone screen Size : "+ myPhone.getSize());
        //override the default owner 
        //myPhone.setOwner("Jane");
        //myPhone.sendSMS("tom", "hi");
        //MobilePhone johnPhone = new MobilePhone("John", "Red", 7.0);
        //johnPhone.sendSMS("Jane", "hi");

        //System.out.println("the current owner is " + myPhone.getOwner());

        //System.out.println("the number of sms sent so far is : " + myPhone.getNum());

        MobilePhone copyPhone = myPhone.clonePhone();
        myPhone.changeName();
        myPhone.printContent();    
        copyPhone.printContent();
        //MobilePhone yourPhone = new MobilePhone("john", "red" , 7.0);
        //yourPhone.printContent();



    }
}