package ConditionalStatementsExercise;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramMemoriesCount = Integer.parseInt(scanner.nextLine());

        int videoCardsPrice = videoCardsCount * 250;
        double processorPrice = processorsCount* (videoCardsPrice * 0.35);
        double ramMemoryPrice = ramMemoriesCount*(videoCardsPrice * 0.10);

        double totalSum = videoCardsPrice + processorPrice + ramMemoryPrice;

        if (videoCardsCount > processorsCount) {
            totalSum *= 0.85;
        }


        if (totalSum <= budget) {
            double leftBudget = budget - totalSum;
            System.out.printf("You have %.2f leva left!%n", leftBudget);
        } else {
            double neededAmount = totalSum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!%n", neededAmount);


        }
    }
}