package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int item: numbersArr){
            if (item % 2 == 0){
                evenSum += item;
            }
            else {
                oddSum += item;
            }
        }
        System.out.printf("Even sum is: %d%n",evenSum);
        System.out.printf("Odd sum is: %d%n",oddSum);
        int result = evenSum - oddSum;
        System.out.printf("%d - %d = %d", evenSum, oddSum, result);
    }
}
