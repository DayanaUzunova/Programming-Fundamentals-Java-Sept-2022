import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String myRegex = "([\\Wa-zA-z]+)>(?<numbers>[0-9]{3})\\|(?<smallletters>[a-z]{3})\\|(?<bigletters>[A-Z]{3})\\|(?<symbols>[\\WA-za-z]{3})<\\1";

        Pattern myPattern = Pattern.compile(myRegex);

        for (int i = 1; i <= number; i++) {
            String userInput = scanner.nextLine();

            Matcher myMatcher = myPattern.matcher(userInput);

            if (myMatcher.find()){
                System.out.println("Password:" + " " + myMatcher.group("numbers") + myMatcher.group("smallletters") + myMatcher.group("bigletters") + myMatcher.group("symbols") );
            }
            else {
                System.out.println("Try another password!");
            }
        }
    }
}
