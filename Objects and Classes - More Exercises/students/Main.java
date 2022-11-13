package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= countStudents; i++) {
            String data = scanner.nextLine();
            String[] dataParts = data.split(" ");

            String firstName = dataParts[0];
            String lastName = dataParts[1];
            double grade = Double.parseDouble(dataParts[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }
        //1. sort * grade
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        //2. print each student
        for (Student student: studentsList){
            System.out.println(student);
        }

    }
}
