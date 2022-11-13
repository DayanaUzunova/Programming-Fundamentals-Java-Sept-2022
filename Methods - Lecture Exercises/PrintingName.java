package Exercises;

import java.util.Scanner;

public class PrintingName {
    public static String getFullName(Scanner scanner) {
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        return firstName + " " + secondName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resultMethod = getFullName(scanner);

        System.out.println(resultMethod);
    }
}
