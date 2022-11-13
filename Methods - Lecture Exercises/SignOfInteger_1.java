package Exercises;

import java.util.Scanner;

public class SignOfInteger_1 {
    public static void printNumSign (int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        }
        else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        }
        else {
            System.out.printf("The number %d is zero.", num);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        printNumSign(numberInput);
    }
}