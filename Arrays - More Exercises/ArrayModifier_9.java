package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        //повтарящо действие -> въвеждане на команди
        //стоп: входни данни == "end"
        //продължаваме: входни данни != "end"

        while (!command.equals("end")){
            //валидна команда за изпълнение
            // "swap {index1} {index2}"
            // "multiply {index1} {index2}"
            // "decrease"

            if(command.contains("swap")){
                //1.взимаме първият индекс със split(" ") и парсване към Int
                int index1 = Integer.parseInt(command.split(" ")[1]);
                //2.взимаме вторият индекс със split(" ") и парсване към Int
                int index2 = Integer.parseInt(command.split(" ")[2]);

                //1.взимаме си елемента на първият индекс
                int element1 = numbers[index1];
                //2.взимаме си елемента на вторият индекс
                int element2 = numbers[index2];

                //размяната
                numbers[index1] = element2;
                numbers[index2] = element1;
            }
            else if (command.contains("multiply")){
                //1.взимаме първият индекс със split(" ") и парсване към Int
                int index1 = Integer.parseInt(command.split(" ")[1]);
                //2.взимаме вторият индекс със split(" ") и парсване към Int
                int index2 = Integer.parseInt(command.split(" ")[2]);

                //1.взимаме си елемента на първият индекс
                int element1 = numbers[index1];
                //2.взимаме си елемента на вторият индекс
                int element2 = numbers[index2];


                int product = element1 * element2;
                numbers[index1] = product;
            }
            else if (command.equals("decrease")){
                //обхождаме всички елементи -> -1
                //обхождаме нашите позиции/индекси от 0 до последния -> numbers.length - 1
                for (int index = 0; index <= numbers.length - 1; index++) {
                    //текущият елемент -> numbers[index]
                    //numbers[index]--;
                    //numbers[index] -= 1;
                    numbers[index] = numbers[index] - 1;
                }
            }
            command = scanner.nextLine();
        }
        //отпечатваме с ", "
        for (int index = 0; index <= numbers.length -1; index++) {
            int currentNumber = numbers[index];
            if (index != numbers.length - 1){
                //не сме на последното число
                System.out.print(currentNumber + ", ");
            } else { //index == numbers.length - 1
                //сме на последното число
                System.out.print(currentNumber);
            }
        }
    }
}
