import java.util.Scanner;
public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        String lastName=scanner.nextLine();
        int age= Integer.parseInt(scanner.nextLine());
        String townname=scanner.nextLine();

        System.out.print("You are "+ name + " " + lastName + ", a " + age + "-years old person from " + townname + ".");

    }
}
