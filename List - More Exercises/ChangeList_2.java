package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с числа
        //получаваме команди -> "end"

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")){
            //1.command Delete
            if (command.contains("Delete")){
                //премахваме всички стойности от списъка които са равни на командата
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForRemove));
            }
            //2. command Insert
            else if (command.contains("Insert")){
                //вмъкваме елемент на определен индекс
                int numberForInsert = Integer.parseInt(command.split(" ")[1]);
                int indexForElement = Integer.parseInt(command.split(" ")[2]);
                numbers.add(indexForElement, numberForInsert);
            }

            command = scanner.nextLine();
        }
        //списък с числа
        for (int number: numbers){
            System.out.print(number + " ");
        }
    }
}
