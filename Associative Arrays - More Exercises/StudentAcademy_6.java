package Exercises;

import java.util.*;

public class StudentAcademy_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int i = 1; i <= countStudents; i++) {
            String name = scanner.nextLine(); //name of student
            double grade = Double.parseDouble(scanner.nextLine()); //grade of student
            //1. да няма такъв студент
            if(!studentsGrade.containsKey(name)){
                studentsGrade.put(name, new ArrayList<>());
            }
            //2. да има такъв студент
            studentsGrade.get(name).add(grade);
        }
        //запис name -> grades

        LinkedHashMap<String, Double> averageGradeStudents = new LinkedHashMap<>();
        //name of student -> average grade
        for (Map.Entry<String, List<Double>> entry: studentsGrade.entrySet()){
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue(); //списък с оценки за всеки студент
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.50){
                averageGradeStudents.put(studentName, averageGrade);
            }
        }
        //print
        averageGradeStudents.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }

    private static double getAverageGrade(List<Double> listGrades) {
       double sumGrades = 0;
        for (double grade: listGrades){
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
