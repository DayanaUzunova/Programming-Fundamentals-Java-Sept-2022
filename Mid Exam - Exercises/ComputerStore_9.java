package Problems;

import java.util.Scanner;

public class ComputerStore_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWithoutTax = 0;
        String input = scanner.nextLine();

        while (!input.equals("special") && !input.equals("regular")){
            double price = Double.parseDouble(input);
            if (price < 0){
                System.out.println("Invalid price!");
            }
            else {
                priceWithoutTax += price;
            }
            input = scanner.nextLine();
        }
        double taxes = priceWithoutTax * 0.2;
        double totalPrice = priceWithoutTax + taxes;
        if (input.equals("special")){
            totalPrice *= 0.9;
        }
        if (totalPrice == 0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n"
            + "-----------%nTotal price: %.2f$", priceWithoutTax, taxes, totalPrice);
        }
    }
}
