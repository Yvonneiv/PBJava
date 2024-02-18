package ConditionalStatementsExercise;
import java.util.Scanner;
public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        //превръщаме всичко в минути и добавяме 15мин

        int totalMinutes = inputHours * 60 + inputMinutes + 15;

        int finalMinutes = totalMinutes % 60;
        int finalHours = totalMinutes / 60;

        if (finalHours < 24)
        {
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }
        else {
            finalHours =0;
            System.out.printf("%d:%02d", finalHours,finalMinutes);
        }
        }









    }

