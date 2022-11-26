package Exercises;

import java.util.Scanner;

public class CaesarCipher_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //first text

        for (char symbol: text.toCharArray()){
            System.out.print((char)(symbol + 3));
        }
    }
}
