package Problems;

import java.util.Scanner;

public class CounterStrike_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int wonBattles =0;
        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);

            if(initialEnergy<distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wonBattles,initialEnergy);
                return;
            }

            initialEnergy -= distance;
            wonBattles++;

            if(wonBattles%3==0){
                initialEnergy+=wonBattles;
            }
            command=scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wonBattles,initialEnergy);
    }
}