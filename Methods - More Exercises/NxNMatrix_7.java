package Exercises;

import java.util.Scanner;

public class NxNMatrix_7 {
    public static void printMatrix(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        //without method
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
         */
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);

    }
}
