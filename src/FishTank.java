import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int  width= Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int fishTankVolume = length * width * height;
        double volumeInLitres = fishTankVolume * 0.001;

        double neededLitres = volumeInLitres * (1 - percentage / 100);
        System.out.println(neededLitres);




    }
}
