package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;

        for (int currentNumber : numbers) {
            sum += currentNumber;
        }
        double averageValue = sum * 1.0 / numbers.size();

        List<Integer> topFiveNumbers = new ArrayList<>();
        for (int currentNumber : numbers) {
            if (currentNumber > averageValue) {
                topFiveNumbers.add(currentNumber);
            }
        }

        if (topFiveNumbers.isEmpty()) {
            System.out.println("No");
        } else if (topFiveNumbers.size() < 5) {
            topFiveNumbers.sort(Collections.reverseOrder());
            for (int number : topFiveNumbers) {
                System.out.printf("%d ", number);
            }
        } else {
            topFiveNumbers.sort(Collections.reverseOrder());
            topFiveNumbers = topFiveNumbers.stream().limit(5).collect(Collectors.toList());
            for (int number : topFiveNumbers) {
                System.out.printf("%d ", number);
            }
        }
    }

}
