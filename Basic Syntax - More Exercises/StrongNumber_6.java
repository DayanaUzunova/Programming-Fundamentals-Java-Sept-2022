package Exercises;

import java.util.Scanner;

public class StrongNumber_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine()); //стойността на числото, която ще се модифицира
        int startNumber = number; //първоначално въведена стойност на числото

        // за всяка цифра
        //1. взимаме всяка една цифра -> число > 0
        //последна цифра (%10), премахване на на последна цифра (/10)
        //2. намираме факториела на цифрата
        //3. сумирам факториела

        int sumFact = 0; //сума от факториели

        while (number > 0) {
            int lastDigit = number % 10; //последна цифра
            // намираме факториела
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            // сумираме факториела
            sumFact += fact;
            number = number / 10; // премахваме последната цифра
        }
            //проверка, дали сумата на факториелите е равна на първоначалното число
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
