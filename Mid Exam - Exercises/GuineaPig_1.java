package Problems;

import java.util.Scanner;

public class GuineaPig_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodKg = Double.parseDouble(scanner.nextLine());
        double quantityHayKg = Double.parseDouble(scanner.nextLine());
        double quantityCoverKg = Double.parseDouble(scanner.nextLine());

        double weightPigKg = Double.parseDouble(scanner.nextLine());
        double foodQuantityGr = quantityFoodKg * 1000;
        double hayQuantityGr = quantityHayKg * 1000;
        double coverQuantityGr = quantityCoverKg * 1000;

        double guineaWeightGr = weightPigKg * 1000;
        boolean isNotEnough = false;

        for (int day = 1; day <= 30; day++) {
            foodQuantityGr = foodQuantityGr - 300;
            if (day % 2 == 0){
                double currentHay = foodQuantityGr * 0.05;
                hayQuantityGr = hayQuantityGr - currentHay;
            }
            if (day % 3 == 0){
                double currentCover = guineaWeightGr / 3;
                coverQuantityGr = coverQuantityGr - currentCover;
            }

            if (foodQuantityGr <= 0 || hayQuantityGr <= 0 || coverQuantityGr <= 0){
                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough) {
            System.out.println("Merry must go to the pet store!");
        }
        else {
            System.out.printf("Everything is fine! Puppy is happy! " +
                            "Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantityGr / 1000,
                    hayQuantityGr / 1000, coverQuantityGr / 1000);
        }
    }
}
