import java.util.Scanner;
public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int litresOfCleaningDetergent = Integer.parseInt(scanner.nextLine());
        int percentageDiscount = Integer.parseInt(scanner.nextLine());

        double totalSumWithoutDiscount = (pensCount * 5.80) + (markersCount * 7.20) + (litresOfCleaningDetergent * 1.20);
        double totalSumWithDiscount = totalSumWithoutDiscount - (totalSumWithoutDiscount * percentageDiscount/100);
        System.out.println(totalSumWithDiscount);


    }
}
