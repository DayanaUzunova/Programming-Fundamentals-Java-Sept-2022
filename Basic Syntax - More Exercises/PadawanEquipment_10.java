package Exercises;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//обща сума = сума за мечове + сума за роби + сума за колани
        //1. сума за мечове = бр. мечове(брой студенти + 10%) * цена на мечове
        //2. сума за роби = бр. роби(бр. студенти) * цена за роби
        //3. сума за колани = бр. колани(студенти - бр. безплатни колани(студенти / 6)) * цена за колани

        double moneyGeorge = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumSabers = Math.ceil(studentsCount + 0.10 * studentsCount) * saberPrice;
        double sumRobes = studentsCount * robePrice;
        double sumBelts = (studentsCount - studentsCount / 6) * beltPrice;

        double totalSum = sumBelts + sumSabers + sumRobes; //сума за плащане

        if (totalSum <= moneyGeorge) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - moneyGeorge;
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(needMoney));
        }
    }
}
