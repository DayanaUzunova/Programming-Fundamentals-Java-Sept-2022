package Exercises;

import java.util.Scanner;

public class SumOfChars_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int symbol = 1; symbol <= countSymbols; symbol++) {
            int code = scanner.nextLine().charAt(0);
            sum += (int) code;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
