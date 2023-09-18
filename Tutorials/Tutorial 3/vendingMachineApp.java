import java.util.Scanner;

public class vendingMachineApp {
    public static void main(String[] args) {
        double drinkCost, totalAmount;
        vendingMachine VM = new vendingMachine();

        drinkCost = VM.selectDrink();
        totalAmount = VM.insertCoins(drinkCost);
        VM.checkChange(totalAmount, drinkCost);
        VM.printReceipt();
    }
}

