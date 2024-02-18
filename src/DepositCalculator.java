import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double increasedPercent = Double.parseDouble(scanner.nextLine());

        double finalSum = depositSum + period * (depositSum * (increasedPercent/100)/12);



        System.out.println(finalSum);

    }
}
