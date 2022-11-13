package Exercises;

import java.util.Scanner;

public class AddAndSubstract_5 {
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
    public static int subtract(int n1, int n2){
        return n1 - n2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstNumber, secondNumber);
        int subtract = subtract(sum, thirdNumber);
        System.out.println(subtract);
    }
}
