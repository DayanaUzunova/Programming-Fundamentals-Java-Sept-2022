package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] commandsLine = command.split(" \\| ");
            switch(commandsLine[0]){
                case "Add Book":
                    String bookToAdd = commandsLine[1];
                    if(!books.contains(bookToAdd)){
                        books.add(0,bookToAdd);
                    }
                    break;

                case "Take Book":
                    String removeBook = commandsLine[1];
                        books.remove(removeBook);
                    break;

                case "Swap Books":
                    String firstBook = commandsLine[1];
                    String secondBook = commandsLine[2];
                    if (books.contains(firstBook) && books.contains(secondBook)){
                        int firstBookIndex = books.indexOf(firstBook);
                        int secondBookIndex = books.indexOf(secondBook);
                        books.set(firstBookIndex, secondBook);
                        books.set(secondBookIndex, firstBook);
                    }
                    break;

                case "Insert Book":
                    String bookToInsert = commandsLine[1];
                    if(!books.contains(bookToInsert)){
                        books.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    int indexOfBook = Integer.parseInt(commandsLine[1]);
                    if (indexOfBook >= 0 && indexOfBook <= books.size() - 1){
                        String elementOfBook = books.get(indexOfBook);
                        System.out.println(elementOfBook);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
            System.out.println(String.join(", ", books));
    }
}
