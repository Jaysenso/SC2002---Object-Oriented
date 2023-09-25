import java.util.ArrayList;

public class FiveGPhone extends MobilePhone implements IntPhone{

    private double dataRate;
    private double credit;

    public FiveGPhone(){
        super.owner = "tom";
        super.color = "black";
        super.screenSize = 8.0; //instantiate superclass
        dataRate = 0;
        credit = 0;
    }

    public FiveGPhone(String owner, String color, double screenSize, double dataRate, double credit){
        super(owner, color, screenSize);
        this.dataRate = dataRate;
        this.credit = credit;
    }

    public double getDataRate(){
        return dataRate;
    }
    public double getCredit(){
        return credit;
    }
    public void setDataRate(double dataRate){
        this.dataRate = dataRate;
    }
    public void setCredit (double credit){
        this.credit = credit;
    }

    public void ring(){
        System.out.println("Play a music");
    }

    public String sendSMS(String receiver, String message){
        this.credit = this.credit - dataRate;
        return super.sendSMS(receiver, message);
    }

    public String sendSMS(String receiver){
        this.credit = this.credit - dataRate;
        System.out.println("hi" + receiver);
        return "Successfully Sent";
    }

    public void printContent(){
        super.printContent();
        System.out.println("data Rate is: " + this.dataRate + "the available credit is :" + this.credit);
    }

}