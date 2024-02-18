import java.util.Scanner;
public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDogFood = Integer.parseInt(scanner.nextLine());
        int countCatsFood = Integer.parseInt(scanner.nextLine());
        double result = countDogFood * 2.50 + countCatsFood * 4;

        System.out.print(result +" lv.");



    }
}
