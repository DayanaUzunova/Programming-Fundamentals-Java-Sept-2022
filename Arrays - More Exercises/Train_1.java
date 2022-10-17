package Exercises;

import java.util.Scanner;

public class Train_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVagoons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[numberOfVagoons];

        int sum = 0;

        for (int index = 0; index < numberOfVagoons; index++) {
            people[index] = Integer.parseInt(scanner.nextLine());
            System.out.print(people[index] + " ");

            sum += people[index];
        }
        System.out.printf("%n%d", sum);
    }
}

