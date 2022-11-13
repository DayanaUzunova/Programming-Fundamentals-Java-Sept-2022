package Exercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static boolean isSumOfDigitsDivisibleBy8(int number){
        //1. sum of digits
        //2. whether it is divisible by 8
        int sumDigits = 0;
        while (number > 0){
            //take the last digit
            //sum it
            //remove
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        return sumDigits % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number){
        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            else {
                number = number / 10;
            }
        }
        //after we got all digit and neither of them was odd
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
           if (isSumOfDigitsDivisibleBy8(number) && isContainsOddDigit(number)){
               System.out.println(number);
           }
        }

    }
}
