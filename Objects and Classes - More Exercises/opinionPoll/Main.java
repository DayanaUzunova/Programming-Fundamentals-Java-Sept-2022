package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine()); //number of lines with personal information
        for (int row = 1; row <= n; row++) {
            String data = scanner.nextLine();//{name} {age}
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age > 30){
                //създавам запис на човека
                Person person = new Person(name, age);
                personList.add(person);
            }
        }
        for (Person person: personList){
            //name - age
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
