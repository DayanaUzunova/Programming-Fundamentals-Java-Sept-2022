package MoreExercises;

import java.util.Scanner;

public class ReverseString_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String result="";
        for(int i=string.length()-1; i>=0; i--) {
            result += string.charAt(i);
        }
        System.out.println(result);

    }
}
