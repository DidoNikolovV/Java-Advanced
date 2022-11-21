package customList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();
        while(!input.equals("END")) {
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch(commandName) {
                case "Add":
                    String element = commandParts[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                   customList.remove(index);
                    break;
                case "Contains":
                    String elementToSearch = commandParts[1];
                    System.out.println(customList.contains(elementToSearch));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementToCompare = commandParts[1];
                    System.out.println(customList.countGreaterTime(elementToCompare));
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Print":
                    System.out.println(customList.toString());
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
