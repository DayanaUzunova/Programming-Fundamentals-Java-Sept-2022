import java.util.*;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> myDictionary = new LinkedHashMap<>();


        String[] myWordOfInfo = scanner.nextLine().split("\\s+[|]\\s+");

        String[] myTestWord = scanner.nextLine().split("\\s+[|]\\s+");
        String inputLine = scanner.nextLine();

        for (int i = 0; i < myWordOfInfo.length; i++) {

            String[] myWordOfDefinition = myWordOfInfo[i].split(": ");
            myDictionary.putIfAbsent(myWordOfDefinition[0], new ArrayList<>());

            if (myDictionary.containsKey(myWordOfDefinition[0])) {

                myDictionary.get(myWordOfDefinition[0]).add(myWordOfDefinition[1]);

            }

        }

        switch(inputLine){
            case "Test":
                for (int i = 0; i < myTestWord.length; i++) {

                    String myCurrentWord = myTestWord[i];

                    if (myDictionary.containsKey(myCurrentWord)) {

                        for (Map.Entry<String, List<String>> outputInfo : myDictionary.entrySet()) {

                            if (outputInfo.getKey().equals(myCurrentWord)) {
                                System.out.printf("%s:%n", outputInfo.getKey());

                                for (int j = 0; j < outputInfo.getValue().size(); j++) {
                                    System.out.printf(" -%s%n", outputInfo.getValue().get(j));
                                }


                            }
                        }

                    }

                }
                break;
            case "Hand Over":
                for (Map.Entry<String, List<String>> output : myDictionary.entrySet()) {

                    System.out.printf("%s ", output.getKey());

                }
                break;
        }
    }
}
