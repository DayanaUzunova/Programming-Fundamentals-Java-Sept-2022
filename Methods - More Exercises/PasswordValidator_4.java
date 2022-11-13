package Exercises;

import java.util.Scanner;

public class PasswordValidator_4 {
    //1. length
    private static boolean isLengthValid(String password){
        //valid - 6 <= 10
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }
        else {
            //not valid -> "Password must be between 6 and 10 char."
            return false;
        }
    }

    //2. content
    private static boolean isContentValid(String password){
        //not valid -> "Password must consist only of letters and digits"
        for (char symbol: password.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        //valid -> letters and digits
        return true;
    }

    //3. digits number
    private static boolean isNumberOfDigitsValid(String password){
        int countDigits = 0; //count digits
        for (char symbol: password.toCharArray()){
            if (Character.isDigit(symbol)){
                countDigits++;
            }
        }
        //valid -> >= 2
        if (countDigits >= 2){
            return true;
        }
        //not valid -> "Password must have at least 2 digits"
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        //length
        if (!isLengthValid(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        //content
        if (!isContentValid(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        //number of digits
        if (!isNumberOfDigitsValid(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isNumberOfDigitsValid(password) && isContentValid(password) && isLengthValid(password)){
            System.out.println("Password is valid");
        }

    }
}
