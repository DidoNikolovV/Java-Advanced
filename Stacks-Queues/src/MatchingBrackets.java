import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> brackets = new ArrayDeque<>();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                brackets.push(i);
            } else if(input.charAt(i) == ')') {
                System.out.println(input.substring(brackets.pop(), i + 1));
            }
        }
    }
}
