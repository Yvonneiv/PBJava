import java.util.Scanner;
public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int neededHours = numberOfProjects * 3;

        System.out.print("The architect " + name + " will need " + neededHours + " hours to complete " + numberOfProjects + " project/s.");

    }
}