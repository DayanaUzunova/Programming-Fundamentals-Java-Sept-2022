package Exercises;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //2. крайна сума за всички артикули
        // бр.слушалки * headsetPrice + бр.мишки * mousePrice +
        // бр.клавиатури * keyboardPrice + бр.монитори * displayPrice

        int countHeadset = lostGames / 2; //брой на счупените слушалки
        int countMouse= lostGames / 3; //брой на счупени мишки
        int countKeyboards = lostGames / 6; //брой на счупените клавиатури
        int countDisplay = lostGames / 12; //брой на счупени монитори

        double finalSum = (countHeadset * headsetPrice) + (countMouse * mousePrice)
                + (countKeyboards * keyboardPrice) + (countDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
