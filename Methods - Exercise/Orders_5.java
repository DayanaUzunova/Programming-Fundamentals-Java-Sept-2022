package Exercises;

import java.util.Scanner;

public class Orders_5 {
    public static double calculator(String text, int number){
        double price = 0;
        switch (text){
            case "coffee":
                price = number * 1.50;
                break;
            case "water":
                price = number * 1.00;
                break;
            case "coke":
                price = number * 1.40;
                break;
            case "snacks":
                price = number * 2.00;
                break;
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculator(input, quantity));


    }
}
