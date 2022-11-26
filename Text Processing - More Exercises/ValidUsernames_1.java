package Exercises;

import java.util.Scanner;

public class ValidUsernames_1 {
    //isValid method
public static boolean isValid (String username){
    //if we have valid length
    if (username.length() < 3 || username.length() > 16){
        //invalid length -> invalid username
        return false;
    }
    //valid length

    //valid content
    for (char symbol: username.toCharArray()){
        if (!Character.isLetterOrDigit(symbol) && symbol!= '-' && symbol != '_'){
            //invalid username
            return false;
        }
    }
    //valid username
    return true;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input data
        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        //check if our usernames are valid
        for(String username: usernames){
            //check for current username
            if (isValid(username)){
                System.out.println(username);
            }
        }
    }
}
