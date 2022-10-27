import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < numberOfCommands; i++) {
            String[] cmdParts = scanner.nextLine().split(" ");

            String command = cmdParts[0];
            switch(command) {
                case "1":
                    int element = Integer.parseInt(cmdParts[1]);
                    stack.push(element);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }

        }
    }
}
