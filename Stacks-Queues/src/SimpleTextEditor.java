import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();

        ArrayDeque<String> commands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();

        for(int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(" ");
            String cmdType = cmdParts[0];
            switch(cmdType) {
                case "1":
                    String textToAppend = cmdParts[1];
                    commands.push(command);
                    executeAdd(textToAppend, text);
                    break;
                case "2":
                    int countElementsToDelete = Integer.parseInt(cmdParts[1]);
                    //
                    StringBuilder elementsToBeDeleted = new StringBuilder();
                    for(int j = text.length() - countElementsToDelete; j < text.length(); j++) {
                        elementsToBeDeleted.append(text.charAt(j));
                    }
                    removedElements.push(elementsToBeDeleted.toString());


                    commands.push(command);
                    executeDelete(countElementsToDelete, text);
                    break;
                case "3":
                    int index = Integer.parseInt(cmdParts[1]);
                    char elementAtIndex = text.charAt(index - 1);
                    System.out.printf("%s%n", elementAtIndex);
                    break;
                case "4":
                    String lastCommand = commands.pop();
                    String[] lastCommandArgs = lastCommand.split(" ");
                    String lastCommandType = lastCommandArgs[0];
                    switch(lastCommandType) {
                        case "1":
                            int elementsDoDelete = lastCommandArgs[1].length();
                            executeDelete(elementsDoDelete, text);
                            break;
                        case "2":
                            String elementsToAddBack = removedElements.pop();
                            executeAdd(elementsToAddBack, text);
                            break;
                    }
                    break;
            }
        }
    }

    private static void executeAdd(String textToAppend, StringBuilder text) {
        text.append(textToAppend);
    }

    private static void executeDelete(int countElementsToDelete, StringBuilder text) {
        for(int i = 0; i <countElementsToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }
    }
}
