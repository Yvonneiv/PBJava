package ConditionalStatementsExercise;
import java.util.Scanner;
import java.util.UUID;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double toysCount = puzzles + dolls + teddyBears + minions + trucks;
        //Пъзел - 2.60 лв.
        //
        //· Говореща кукла - 3 лв.
        //
        //· Плюшено мече - 4.10 лв.
        //
        //· Миньон - 8.20 лв.
        //
        //· Камионче - 2 лв.
        //
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        double totalPrice = puzzles * 2.60 + dolls * 3 + teddyBears * 4.10 + minions * 8.20 + trucks *2;

        if (toysCount >=50) // Имаш го в условието, че е възможно да са равни или повече от 50
        {
            totalPrice = totalPrice * 0.75; // Не създаваш нова променлива, защото вече получената сума се намалява
        }
        totalPrice = totalPrice * 0.9; // Това тук също не е новополучена сума, а същата от началото, но с корекция

        if (totalPrice >= tripPrice)
        {
            double leftMoney = totalPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftMoney); // Между текста и шаблона няма кавички и плюсове
        }
        else
        {
            double neededMoney = tripPrice - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }

    }

}
