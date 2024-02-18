package ConditionalStatementsExercise;
import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int countExtra = Integer.parseInt(scanner.nextLine());
        double priceForEquipmentPerOnePerson = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget * 0.1;
        double moneyForClothes = countExtra * priceForEquipmentPerOnePerson;


        if (countExtra > 150)
        {
            moneyForClothes = moneyForClothes * 0.9;
        }
        double totalSum = moneyForClothes + decor;
        double difference = Math.abs(totalSum - filmBudget);

        if (totalSum > filmBudget)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
        else
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",difference);
        }

    }
}
