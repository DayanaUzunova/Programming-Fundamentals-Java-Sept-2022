package Exercises;

import java.util.Scanner;

public class DigitsLettersAndOther_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            //Agd#53Dfg^&4F53
           if (Character.isDigit(currentSymbol)){
               digitSb.append(currentSymbol);
           }
           else if (Character.isLetter(currentSymbol)){
               letterSb.append(currentSymbol);
           }
           else {
               otherSb.append(currentSymbol);
           }
        }
        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
