import javax.swing.*;
import java.util.Scanner;
public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veggieMenus = Integer.parseInt(scanner.nextLine());

        double orderSumWithoutDessert = chickenMenus * 10.35 + fishMenus * 12.40 + veggieMenus * 8.15;
        double finalSum = orderSumWithoutDessert + (orderSumWithoutDessert * 0.2) +2.50;
        System.out.println(finalSum);


    }
}
