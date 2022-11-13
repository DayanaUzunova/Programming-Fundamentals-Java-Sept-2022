package Exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            //command = "{force_side} | {force_side}
            if (command.contains(" | ")) {
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];

                //нямаме такава група
                if (!map.containsKey(group)) {
                    //group -> empty list
                    map.put(group, new ArrayList<>());
                }
                //имаме такава група - добавяме към групата нашият user, ако го няма в никоя група!
                boolean isExistUser = false; //user го има в дадена група

                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        isExistUser = true;
                        break;
                    }
                }
                if (!isExistUser) {
                    //user го няма в никоя група
                    map.get(group).add(user);
                }
            }
            //command = "{force_side} -> {force_side}
            else if (command.contains(" -> ")) {
                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1]; //групата в която отива

                //1. ако дадения user го има в дадена група го премахваме
                //махаме го от текущата група
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                //проверявам дали съществува такава група
                if (map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    //ако нямаме такава група, в която иска да отиде
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, group);
            }
            command = scanner.nextLine();
        }
        //map: group -> users
        //филтрирам записите, тези, на които списъка с хора не е празен
        map.entrySet()//.stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                            if (entry.getValue().size() > 0) {
                                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                                entry.getValue().forEach(user -> System.out.println("! " + user));
                            }
                        }
                );
    }
}

