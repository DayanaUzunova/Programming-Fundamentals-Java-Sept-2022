package Exercises;

import java.util.Scanner;

public class LowerOrUpper_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)) {
            System.out.println("upper-case");
        }
        else {
            System.out.println("lower-case");
        }

        /*
        if (symbol >= 'A' && symbol <= 'Z'){
            System.out.println("upper-case");
        }
        else {
            System.out.println("lower-case");
        }

         */
    }
}