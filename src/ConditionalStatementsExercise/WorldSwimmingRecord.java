package ConditionalStatementsExercise;
import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //
        //3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeWithoutTheResistance = distanceInMeters * timeInSeconds;
        double timeWithTheResistance = Math.floor((distanceInMeters / 15)) * 12.5;
        double totalTime = timeWithoutTheResistance + timeWithTheResistance;



        if (worldRecordInSeconds > totalTime)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime );
        }
        else {
            double difference = Math.abs(worldRecordInSeconds- totalTime);
            System.out.printf("No, he failed! He was %.2f seconds slower.",difference);
        }

    }
}
