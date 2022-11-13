package Exercises;

import java.util.Scanner;

public class SpaceTravel_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int amountOfStartingFuel = Integer.parseInt(scanner.nextLine());
        int amountOfStartingAmmunition = Integer.parseInt(scanner.nextLine());

        String[] commandArray = command.split("\\|\\|");


        for (int index = 0; index < commandArray.length; index++) {
            String[] commands = commandArray[index].split(" ");

            String firstCommand = commands[0];

            switch (firstCommand) {
                case "Travel":
                    int distanceOfTravel = Integer.parseInt(commands[1]);
                    if (amountOfStartingFuel >= distanceOfTravel) {
                        System.out.printf("The spaceship travelled %d light-years.%n", distanceOfTravel);
                        amountOfStartingFuel -= distanceOfTravel;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    int armorOfEnemy = Integer.parseInt(commands[1]);

                    if (amountOfStartingAmmunition >= armorOfEnemy) {
                        System.out.printf("An enemy with %d armour is defeated.%n", armorOfEnemy);
                        amountOfStartingAmmunition -= armorOfEnemy;
                    }
                    else if ((amountOfStartingFuel / 2) >= armorOfEnemy) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", armorOfEnemy);

                        amountOfStartingFuel-=armorOfEnemy*2;
                    }
                    else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Repair":
                    int numberToRepair = Integer.parseInt(commands[1]);

                    amountOfStartingFuel += numberToRepair;
                    amountOfStartingAmmunition += numberToRepair * 2;

                    System.out.printf("Ammunitions added: %d.%n", numberToRepair * 2);
                    System.out.printf("Fuel added: %d.%n", numberToRepair);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
            }
        }
    }
}
