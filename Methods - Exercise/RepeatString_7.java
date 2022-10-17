package Exercises;

import java.util.Scanner;

public class RepeatString_7 {
    public static String repeatString(int n, String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(text);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(n, inputText);

        System.out.println(resultText);
    }
}
