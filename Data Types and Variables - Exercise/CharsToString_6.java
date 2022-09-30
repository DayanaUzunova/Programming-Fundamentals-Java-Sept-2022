package Exercises;

import java.util.Scanner;

public class CharsToString_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        String result = String.format("%c%c%c", symbol1, symbol2, symbol3);
        System.out.print(result);
    }
}
