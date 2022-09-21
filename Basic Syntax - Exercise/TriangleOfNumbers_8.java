package Exercises;

import java.util.Scanner;

public class TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            //колко пъти ще печатим нещо
            for (int count = 1; count <= rows ; count++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}

