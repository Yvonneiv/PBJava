import java.util.Scanner;
public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaInMeters=Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount= areaInMeters * 7.61;
        double priceWithTheDiscount = priceWithoutDiscount * 0.18;
        double finalPrice = priceWithoutDiscount - priceWithTheDiscount;


        System.out.print("The final price is: " + finalPrice + " lv.");
        System.out.print("The discount is: " + priceWithTheDiscount + " lv.");


    }
}
