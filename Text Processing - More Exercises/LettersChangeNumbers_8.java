package Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double totalSum = 0; //all codes sum
        for (String code: codes){
            //modification of the number
             double modifiedNumber = getModifiedNumber(code);
            //add it to the sum
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ').trim());

        //check about our firstLetter
        if (Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        }
        else {
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }

        if (Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int) secondLetter - 64;
            number -= positionUpperLetter;
        }
        else {
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
