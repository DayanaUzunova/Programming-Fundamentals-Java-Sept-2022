package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            boolean isBiggest = true;
            for (int index1 = index + 1; index1 <= numbers.length -1; index1++) {
                if (numbers[index] <= numbers[index1]){
                    isBiggest = false;
                }
            }
            if (isBiggest){
                System.out.print(numbers[index] + " ");
            }
        }
    }
}
