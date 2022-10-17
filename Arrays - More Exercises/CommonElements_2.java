package Exercises;

import java.util.Scanner;

public class CommonElements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни - два текстови масива
        //2. обхождаме всеки един от елементите на втория масив
        //3. повтарям до намиране на съвпадение

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String elementSecondArray: secondArray) {
            for (String elementFirstArray: firstArray){
                if(elementSecondArray.equals(elementFirstArray)){
                    System.out.print(elementFirstArray + " ");
                    break;
                }
            }
        }

    }
}
