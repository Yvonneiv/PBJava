package ConditionalStatementsExercise;
import java.util.Scanner;
public class BonusScore02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        //Ако числото е до 100 включително, бонус точките са 5.
        //
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        if (points <= 100) {
            bonusPoints = 5;
        }
        else if (points > 1000)
        {
            bonusPoints = points * 0.10;

        }
        else {
            bonusPoints = points * 0.2;
        }
        if (points % 2 ==0)
        {
         bonusPoints = bonusPoints +1;
        }
        else if (points % 10 ==5){
         bonusPoints = bonusPoints + 2;

        }
        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);


    }
}
