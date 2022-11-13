package Exercises;

import java.util.Scanner;

public class VowelsCount_2 {
    public static void printVowelsCount(String text) {
        int countVowels = 0;
        for(char symbol: text.toCharArray()){
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u'){
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelsCount(text.toLowerCase());
    }
}
