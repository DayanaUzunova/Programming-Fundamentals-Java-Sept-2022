package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());;

        //1. взимам число от масива - обхождам всички след него
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //2. обхождам всички числа след моето число
            for (int innerIndex = index + 1; innerIndex <= numbers.length - 1; innerIndex++) {
                int innerNumber = numbers[innerIndex];

                if (currentNumber + innerNumber == magicSum){
                    System.out.println(currentNumber + " " + innerNumber);
                }
            }
        }
    }
}
