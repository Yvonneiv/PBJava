package ConditionalStatements;
import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFigure = scanner.nextLine();
        double areaOfTheFigure = 0;

        if (typeOfFigure .equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
             areaOfTheFigure = side * side;
        }
        else if (typeOfFigure .equals("rectangle"))
        {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            areaOfTheFigure = sideA * sideB;
        }
        else if (typeOfFigure .equals("circle"))
        {
            double radius = Double.parseDouble(scanner.nextLine());
            areaOfTheFigure = Math.PI * radius * radius;
        }
        else if (typeOfFigure .equals("triangle"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            areaOfTheFigure =( a * height) / 2;
        }

        System.out.printf("%.3f",areaOfTheFigure );

    }
}
