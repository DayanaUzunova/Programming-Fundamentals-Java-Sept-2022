package Exercises;

import java.util.Scanner;

public class MathOperations_11 {
    public static double calculate(int n1, String text, int n2){
        double result = 0.0;
        switch(text){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 * 1.0/ n2;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(firstNumber, input, secondNumber));
    }
}
