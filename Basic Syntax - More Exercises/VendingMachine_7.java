package Exercises;

import java.util.Scanner;

public class VendingMachine_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.0;

        while (!input.equals("Start")) {
            double randomCoins = Double.parseDouble(input);

            if (randomCoins != 0.1 && randomCoins != 0.2 &&
                    randomCoins != 0.5 && randomCoins != 1.00 &&
                    randomCoins != 2.00) {
                System.out.printf("Cannot accept %.2f%n", randomCoins);
            } else {
                sum += randomCoins;
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum >= 2.00) {
                        sum -= 2.00;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.70) {
                        sum -= 0.70;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.80) {
                        sum -= 0.80;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        if (sum >= 0) {
            System.out.printf("Change: %.2f", sum);
        }
    }
}
