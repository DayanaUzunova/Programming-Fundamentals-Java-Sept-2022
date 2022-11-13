package Problems;

import java.util.Scanner;

public class SoftUniReception_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int needHours = 0;
        int answersPerHour = firstEmployee  + secondEmployee + thirdEmployee;

        while(studentsCount > 0){
            studentsCount -= answersPerHour;
            needHours++;

            if (needHours % 4 == 0){
                needHours++;
            }
        }
        System.out.printf("Time needed: %dh.", needHours);
    }
}
