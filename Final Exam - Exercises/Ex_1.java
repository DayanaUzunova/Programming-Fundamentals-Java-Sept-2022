import java.util.Scanner;

public class Ex_1 {
    public static boolean isTheIndexValid(StringBuilder spell, int index){
    return index >= 0 && index < spell.length();
}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder spellOfWizard = new StringBuilder(scanner.nextLine());

        String userInput = scanner.nextLine();
        while(!userInput.equals("Abracadabra")){
            String commandOfInput = userInput.split("\\s+")[0];



            if (commandOfInput.equals("Abjuration")){
                spellOfWizard = new StringBuilder(spellOfWizard.toString().toUpperCase());
                System.out.println(spellOfWizard);
            }
            else if (commandOfInput.equals("Necromancy")){
                spellOfWizard = new StringBuilder(spellOfWizard.toString().toLowerCase());
                System.out.println(spellOfWizard);
            }
            else if (commandOfInput.equals("Illusion")){
                int index = Integer.parseInt(userInput.split("\\s+")[1]);
                char letter = userInput.split("\\s+")[2].charAt(0);

                if (isTheIndexValid(spellOfWizard, index)){
                    spellOfWizard.setCharAt(index, letter);
                    System.out.println("Done!");
                }
                else {
                    System.out.println("The spell was too weak.");
                }

            }
            else if(commandOfInput.equals("Divination")){
                String myFirstSubstring = userInput.split("\\s+")[1];
                String mySecondSubstring = userInput.split("\\s+")[2];
                while(spellOfWizard.toString().contains(myFirstSubstring)){
                    spellOfWizard = new StringBuilder(spellOfWizard.toString().replace(myFirstSubstring, mySecondSubstring));
                }
                System.out.println(spellOfWizard);

            }
            else if(commandOfInput.equals("Alteration")){
                String mySubstring = userInput.split("\\s+")[1];
                if (spellOfWizard.toString().contains(mySubstring)){
                    spellOfWizard = new StringBuilder(spellOfWizard.toString().replace(mySubstring, ""));
                }
                System.out.println(spellOfWizard);

            }
            else {
                System.out.println("The spell did not work!");
            }
            userInput = scanner.nextLine();
        }
    }
}
