package Exercises;

import java.util.Scanner;

public class TextFilter_4 {
    public static String replaceString (String s, int count){
        //String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
            //result += s;
        }
        //return result;
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Linux, Windows
        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr){
            text = text.replace(banWord, replaceString("*", banWord.length()));
        }
        System.out.println(text);
    }
}
