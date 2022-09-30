package Exercises;

import java.util.Scanner;

public class IntegerOperations_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //първо + второ = сума
        //(сума / третото) * четвърто

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        int result = ((firstNumber + secondNumber) / thirdNumber) * fourthNumber;
        System.out.println(result);

    }
}
