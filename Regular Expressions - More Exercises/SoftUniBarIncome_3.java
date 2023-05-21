package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex); //шаблон

        double incomes = 0; //общия приход от всички продукти

        while(!input.equals("end of shift")) {
            //input = "%George%<Croissant>|2|10.3$"
            Matcher matcher = pattern.matcher(input);
            //matcher = "%(?<customerName>George)%<(?<product>Croissant)>|(?<count>2)|(?<price>10.3)$"
            if(matcher.find()) {
                String customerName = matcher.group("customerName"); //"George"
                String product = matcher.group("product"); //"Croissant"
                int count = Integer.parseInt(matcher.group("count")); // "2" -> parseInt -> 2
                double price = Double.parseDouble(matcher.group("price")); // "10.3" -> parseDouble -> 10.3
                double totalPrice = count * price; //приход за единичния продукт
                incomes += totalPrice;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", incomes);
    }
}
