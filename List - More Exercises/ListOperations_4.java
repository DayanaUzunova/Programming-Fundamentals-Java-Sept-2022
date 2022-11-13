package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_4 {
    //метод, който проверява дали даден индекс е валиден
    //true -> ако е валиден
    //false -> ако не е
    public static boolean isValidIndex(int index, List<Integer>numbers){
        return index >= 0 && index <= numbers.size() - 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с цели числа
        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        //команди
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.contains("Add")){
                //add number at the end
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            }
            else if (command.contains("Insert")){
                //insert number at given index
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                //проверка дали този индекс съществува
                if (isValidIndex(index, numbers)){
                    //valid index
                    numbers.add(index, numberToInsert);
                }
                else {
                    System.out.println("Invalid index");
                }
            }
            else if (command.contains("Remove")){
                //remove that index
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]);
                //проверка дали този индекс съществува
                if (isValidIndex(indexForRemove, numbers)){
                    numbers.remove(indexForRemove);
                }
                else {
                    System.out.println("Invalid index");
                }
            }
            else if (command.contains("Shift left")){
                //shift left 'count' - first number becomes last 'count' times
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftLeft; time++) {
                    //get first number in list
                    int firstNumber = numbers.get(0);
                    //remove that number
                    numbers.remove(0);
                    //add it at the end of our list
                    numbers.add(firstNumber);
                }
            }
            else if (command.contains("Shift right")){
                //shift right - last number becomes first 'count' times
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftRight; time++) {
                    //get our last number -> index = size() - 1
                    int lastNumber = numbers.get(numbers.size() - 1);
                    //remove this number
                    numbers.remove(numbers.size() - 1);
                    //add it at the beginning of our list
                    numbers.add(0, lastNumber);
                }
            }

            command = scanner.nextLine();
        }
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }
}
