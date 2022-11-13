package Exercises;

import java.util.Scanner;

public class Login_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. username -> входни данни
        //2. password -> на обратно
        //3. въвеждане на парола
        String username = scanner.nextLine();
        String password = "";
    //всяка позиция в текста -> последната (дължина - 1) към първата (0)
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        //знаем каква ни е паролата
        String enteredPassword = scanner.nextLine();
        int counterFailedTries = 0; //брой опити за въвеждане на парола
        // повтаряме, въвеждаме парола и проверяваме дали съвпада
        // продължаваме, докато enteredPassword != password
        while (!enteredPassword.equals(password)) {
            //грешно въведена парола
            counterFailedTries++;
            if (counterFailedTries == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
            }
        // стоп: въведената парола == password
            if (enteredPassword.equals(password)) {
                System.out.printf("User %s logged in.", username);
        }
    }
}
