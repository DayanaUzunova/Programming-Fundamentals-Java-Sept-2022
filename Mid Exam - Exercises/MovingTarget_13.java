package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Shoot":
                    int shotIndex = Integer.parseInt(command[1]);
                    if (shotIndex < arr.size() && shotIndex >= 0) {
                        arr.set(shotIndex, arr.get(shotIndex) - Integer.parseInt(command[2]));
                        if (arr.get(shotIndex) <= 0) {
                            arr.remove(shotIndex);
                        }
                    }
                    break;
                case "Add":
                    int indexToAdd = Integer.parseInt(command[1]);
                    if (indexToAdd < arr.size() && indexToAdd >= 0) {
                        arr.add(indexToAdd, Integer.parseInt(command[2]));
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int index = Integer.parseInt(command[1]);
                    int radius = Integer.parseInt(command[2]);
                    if (index + radius < arr.size() && index - radius >= 0) {
                        arr.subList(index - radius, index + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
        }
        System.out.print(Arrays.toString(new List[]{arr}).replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }
}
