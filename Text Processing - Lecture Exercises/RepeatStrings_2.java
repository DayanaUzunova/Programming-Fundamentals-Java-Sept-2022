package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_2 {
    public static String repeatString(String word, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + word;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        //hi abc add
        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();

            String repeatedWord = repeatString(currentWord, length);

            repeatList.add(repeatedWord);
        }
        System.out.println(String.join("", repeatList));
    }
}
