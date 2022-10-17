package Exercises;

import java.util.Scanner;

public class CalculateRectangleArea_6 {
    public static int calculateArea(int width, int length) {
        return width * length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int result = calculateArea(widthInput, lengthInput);
        System.out.println(result);
    }
}
