package Exercises;

import java.util.Scanner;

public class FactorialDivision_8 {
    public static long calculateFactorial(int number){
        long fact = 1; //не се умножава на 0
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //fact of firstNumber
        long fact1 = calculateFactorial(firstNumber);

        //fact of secondNumber
        long fact2 = calculateFactorial(secondNumber);

        //factFirstNumber / factSecondNumber
        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f",result);

    }
}
