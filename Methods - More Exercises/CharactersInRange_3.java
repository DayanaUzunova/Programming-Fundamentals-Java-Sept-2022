package Exercises;

import java.util.Scanner;

public class CharactersInRange_3 {
    public static void printCharactersInRange(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol){
            //starts with firstSymbol
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++){
                System.out.print(symbol + " ");
            }
        }
        else {
            //starts with secondSymbol
            for(char symbol = (char)(secondSymbol + 1); symbol < firstSymbol; symbol++){
                System.out.print(symbol + " ");
            }
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }


}
