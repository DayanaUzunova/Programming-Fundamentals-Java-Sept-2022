package Exercises;

import java.util.Scanner;

public class ExperienceGaining_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double allExperience = 0.0;
        int countBattle = 0;

        for (int currentBattle = 1; currentBattle <= countOfBattles; currentBattle++) {
            double experienceToGain = Double.parseDouble(scanner.nextLine());

            allExperience += experienceToGain;
            countBattle++;

            if (currentBattle == 3) {
                allExperience += experienceToGain * 0.15;
            }
                if (currentBattle == 5) {
                    allExperience -= experienceToGain * 0.10;
                }

                if (currentBattle == 15){
                    allExperience += experienceToGain * 0.05;
                }


            if (allExperience >= amountOfExperience){
                break;
            }

        }
            if (allExperience >= amountOfExperience){
                System.out.printf("Player successfully collected his needed experience for %d battles.", countBattle);
            }
            else {
                System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", amountOfExperience - allExperience);
            }
    }
}
