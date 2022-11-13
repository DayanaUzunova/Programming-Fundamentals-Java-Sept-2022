package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String inputCommand = scanner.nextLine();

        while(!inputCommand.equals("end")){
            String[] commandArr = inputCommand.split(" ");
            String command = commandArr[0];
            switch(command){
                // swap 1 3
                case "swap":
                    int swapIndexOne = Integer.parseInt(commandArr[1]);
                    int swapIndexSecond = Integer.parseInt(commandArr[2]);

                    int valueAtIndexOne = numbersArr[swapIndexOne];
                    int valueAtIndexTwo = numbersArr[swapIndexSecond];

                    numbersArr[swapIndexOne] = valueAtIndexTwo;
                    numbersArr[swapIndexSecond] = valueAtIndexOne;

                    break;
                case "multiply":
                    int multiplyIndexOne = Integer.parseInt(commandArr[1]);
                    int multiplyIndexSecond = Integer.parseInt(commandArr[2]);

                    int product = numbersArr[multiplyIndexOne] * numbersArr[multiplyIndexSecond];
                    numbersArr[multiplyIndexOne] = product;

                    break;
                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i] = numbersArr[i] - 1;
                    }

                    break;
            }

            inputCommand = scanner.nextLine();
        }
        /*First way
        for (int i = 0; i < numbersArr.length; i++){
            if (i == numbersArr.length - 1){
                System.out.print(numbersArr[i]);
            }
            else {
                System.out.print(numbersArr[i] + ", ");
            }
        }
         */

        //Second way
        String[] resultArr = new String[numbersArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = String.valueOf(numbersArr[i]);
        }
        System.out.println(String.join(", ", resultArr));
    }
}
