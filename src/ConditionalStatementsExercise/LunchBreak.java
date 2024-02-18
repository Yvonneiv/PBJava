package ConditionalStatementsExercise;
import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int lengthOfTheEpisode = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());

        double lunchBreakTime = breakLength / 8.0;
        double chillTime = breakLength /4.0;
        double leftTime = breakLength - lunchBreakTime - chillTime;
        double diff = Math.ceil(Math.abs(leftTime - lengthOfTheEpisode));



        if (leftTime >= lengthOfTheEpisode)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName,diff);
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,diff
            );
        }

    }
}
