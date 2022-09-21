package MoreExercises;

import java.util.Scanner;

public class GamingStore_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;

        String input = scanner.nextLine();


        while (!input.equals("Game Time")) {

            if (balance > 0) {
                if (input.equals("OutFall 4")) {
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        totalPrice += 39.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0){
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else if (input.equals("CS: OG")) {
                    if (balance >= 15.99) {
                        balance -= 15.99;
                        totalPrice += 15.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0) {
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else if (input.equals("Zplinter Zell")) {
                    if (balance >= 19.99){
                        balance -= 19.99;
                        totalPrice += 19.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0){
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else if (input.equals("Honored 2")) {
                    if (balance >= 59.99){
                        balance -= 59.99;
                        totalPrice += 59.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0){
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else if (input.equals("RoverWatch")) {
                    if (balance >= 29.99){
                        balance -= 29.99;
                        totalPrice += 29.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0){
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else if (input.equals("RoverWatch Origins Edition")) {
                    if (balance >= 39.99){
                        balance -= 39.99;
                        totalPrice += 39.99;
                        System.out.println("Bought " + input);
                        if (balance <= 0){
                            System.out.println("Out of money!");
                            return;
                        }
                    }
                    else {
                        System.out.println("Too Expensive");
                    }
                }
                else {
                    System.out.println("Not Found");
                }
            }
            else {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f.", totalPrice);
        System.out.printf(" Remaining: $%.2f", balance);
    }
}
