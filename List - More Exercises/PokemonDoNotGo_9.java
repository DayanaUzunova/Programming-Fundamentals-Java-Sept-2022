package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                        split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;

        //repeat: input a string
        //stop: list is empty -> size <= 0
        //list is full -> size > 0
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            //1. index in list -> >= 0 and <= size() - 1
            if (index >= 0 && index <= numbers.size() - 1) {
                //get that index
                int removedElement = numbers.get(index);
                sumRemoved += removedElement;
                //remove it
                numbers.remove(index);
                //modification our list 7
                modifyList(numbers, removedElement);

            } else if (index < 0) {
                //get the first number
                int firstNumber = numbers.get(0); //removed element
                sumRemoved += firstNumber;
                //remove it
                numbers.remove(0);
                //get last element of our list
                int lastElement = numbers.get(numbers.size() - 1);
                //insert last element at that index
                numbers.add(0, lastElement);
                //modification of our list
                modifyList(numbers, firstNumber);
            }
            else if (index > numbers.size() - 1){
                //get out last element
                int lastElement = numbers.get(numbers.size() - 1);
                sumRemoved += lastElement;
                //remove last element
                numbers.remove(numbers.size() - 1);
                //get our first element
                int firstElement = numbers.get(0);
                //put our last element at index
                numbers.add(firstElement);
                //modify
                modifyList(numbers, lastElement);
            }
        }
        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> numbers, int firstNumber) {
        for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
            int currentNumber = numbers.get(indexInList);
            if (currentNumber <= firstNumber) {
                currentNumber += firstNumber;
            } else {
                currentNumber -= firstNumber;
            }
            numbers.set(indexInList, currentNumber);
        }
    }
}