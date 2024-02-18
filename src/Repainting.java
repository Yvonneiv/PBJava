import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int dye = Integer.parseInt(scanner.nextLine());
        int thinner= Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double dyePrice = (dye + dye * 0.10) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double totalPriceForMaterials = nylonPrice + dyePrice + thinnerPrice + 0.40;

        double totalSumWithoutTheMastersWork = (totalPriceForMaterials * 0.30) * workingHours;

        double finalSum = totalPriceForMaterials +totalSumWithoutTheMastersWork;
        System.out.println(finalSum);


    }
}
