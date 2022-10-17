package Exercises;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static int getMultipleOfEvensAndOdds(int n){
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);

        return evenSum * oddSum;
    }
    public static int getEvenSum(int number){
        int evenSum = 0;
        while(number!=0) {

            // find last digit
            int lastDigit = number % 10;

            // check last digit even?
            if (lastDigit % 2 == 0) {
                // add it to sum
                evenSum += lastDigit;
            }

            number = number / 10;
        }
        return evenSum;
    }

    public static int getOddSum(int number){
        int oddSum = 0;
        while (number != 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                oddSum += lastDigit;
            }
            number = number / 10;
        }
        return oddSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.abs(getMultipleOfEvensAndOdds(number)));
    }

}