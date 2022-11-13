package orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("End")){
            //input - data for a person

            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }
        //1.sort people at ascending order
        personList.sort(Comparator.comparing(Person::getAge));
        //2. print each of them
        for (Person person: personList){
            System.out.println(person);
        }
    }
}
