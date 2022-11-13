package articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();

        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine()); //count commands
        for (int commandCount = 1; commandCount <= n; commandCount++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")){
                //change our content with the given one
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            }
            else if (command.contains("Rename")){
                //change our article's name with the given one
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            }
            else if (command.contains("ChangeAuthor")){
                //change our article's author with the given one
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }
        //title - content: author
        System.out.println(article);
    }
}
