package ConditionalStatementsAdvanced;
import java.util.Scanner;
public class AnimalType03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        switch (animalType)
        {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
