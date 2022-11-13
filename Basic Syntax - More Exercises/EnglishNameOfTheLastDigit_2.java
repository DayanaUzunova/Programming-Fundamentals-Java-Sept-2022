package MoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int last = number % 10;
        if (last == 1) {
            System.out.println("one");
        }
        else if (last == 2) {
            System.out.println("two");
        }
        else if (last == 3) {
            System.out.println("three");
        }
        else if (last == 4) {
            System.out.println("four");
        }
        else if (last == 5) {
            System.out.println("five");
        }
        else if (last == 6) {
            System.out.println("six");
        }
        else if (last == 7) {
            System.out.println("seven");
        }
        else if (last == 8) {
            System.out.println("eight");
        }
        else if (last == 9) {
            System.out.println("nine");
        }
        else if (last == 0) {
            System.out.println("zero");
        }
    }
}
