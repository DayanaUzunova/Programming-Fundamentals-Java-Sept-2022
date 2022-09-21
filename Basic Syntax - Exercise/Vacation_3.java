package Exercises;

import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price;
        double allPrice = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45 * group;
                    if (group >= 30) {
                        allPrice = price - (price * 0.15);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Saturday")) {
                    price = 9.80 * group;
                    if (group >= 30) {
                        allPrice = price - (price * 0.15);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Sunday")) {
                    price = 10.46 * group;
                    if (group >= 30) {
                        allPrice = price - (price * 0.15);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90 * group;
                    if (group >= 100) {
                        allPrice = price - (10.90 * 10);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Saturday")) {
                    price = 15.60 * group;
                    if (group >= 100) {
                        allPrice = price - (15.60 * 10);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Sunday")) {
                    price = 16.00 * group;
                    if (group >= 100) {
                        allPrice = price - (16.00 * 10);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15.00 * group;
                    if (group >= 10 && group <= 20) {
                        allPrice = price - (price * 0.05);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Saturday")) {
                    price = 20.00 * group;
                    if (group >= 10 && group <= 20) {
                        allPrice = price - (price * 0.05);
                    } else {
                        allPrice = price;
                    }
                    break;
                }
                if (day.equals("Sunday")) {
                    price = 22.50 * group;
                    if (group >= 10 && group <= 20) {
                        allPrice = price - (price * 0.05);
                    } else {
                        allPrice = price;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", allPrice);
    }

}



