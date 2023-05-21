import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String datesStrings = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex); //шаблон

        Matcher dates = pattern.matcher(datesStrings); //текстовете от text, които match-ват с regex

        while(dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
