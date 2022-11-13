package Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");
        //create map -> char -> number of times
        LinkedHashMap<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol: text.toCharArray()){
            //1- да не съм срещала такъв символ
            //2- да съм го срещала
            if(!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, 1);
            }
            else {
                int currentCount = symbolCount.get(symbol); //текущият брой на срещания
                symbolCount.put(symbol, currentCount + 1);
            }
        }
        //print
        //entry: key(symbol) -> value
        symbolCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
