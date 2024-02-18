import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        double basketballSneakers = 0.60 * annualFee;
        double basketballEquipment = 0.80 * basketballSneakers;
        double basketballBall =   basketballEquipment/4;
        double basketballAccessories = basketballBall/5;

        double finalSum = basketballSneakers + basketballEquipment + basketballBall + basketballAccessories + annualFee;
        System.out.println(finalSum);


    }
}
