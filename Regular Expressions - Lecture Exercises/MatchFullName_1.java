import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex); //шаблон

        Matcher matcher = pattern.matcher(text); //текстовете от text, които match-ват с regex

        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
