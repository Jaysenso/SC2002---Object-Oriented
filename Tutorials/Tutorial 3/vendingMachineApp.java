
import java.util.Scanner;

public class vendingMachineApp {
    public static void main(String[] args) {
    double drinkCost;

        //exception handling default return -1 unless legal input
        drinkCost = selectDrink();
        System.out.println(drinkCost);
    }
}
}
