package Exercises;

import java.util.Scanner;

public class ConvertMetersToKilometers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metres = Integer.parseInt(scanner.nextLine());

        double kilometers = metres * 0.001;
        System.out.printf("%.2f",kilometers);
    }
}
