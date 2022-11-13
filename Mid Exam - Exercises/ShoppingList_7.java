package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine()
                .split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] commandsLine = input.split(" ");
            String command = commandsLine[0];

            switch(command){
                case "Urgent":
                    String addItem = commandsLine[1];
                    if (!groceries.contains(addItem)){
                        groceries.add(0, addItem);
                    }
                    break;
                case "Unnecessary":
                    String removeItem = commandsLine[1];
                        groceries.remove(removeItem);
                    break;
                case "Correct":
                    String oldItem = commandsLine[1];
                    String newItem = commandsLine[2];

                    if (groceries.contains(oldItem)){
                        int index = groceries.indexOf(oldItem);
                        groceries.add(index, newItem);
                        groceries.remove(oldItem);
                    }
                    break;
                case "Rearrange":
                    String item = commandsLine[1];
                    if (groceries.contains(item)){
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}
