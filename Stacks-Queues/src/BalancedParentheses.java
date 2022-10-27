import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for(int i = 0; i < input.length(); i++) {
            char currentBrackets = input.charAt(i);
            if(currentBrackets == '{' || currentBrackets == '[' || currentBrackets == '(') {
                openingBrackets.push(currentBrackets);
            }else {
                if(openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpeningBrackets = openingBrackets.pop();
                if(currentBrackets == ')' && lastOpeningBrackets != '(') {
                    isBalanced = false;
                } else if(currentBrackets == '}' && lastOpeningBrackets != '{') {
                    isBalanced = false;
                } else if(currentBrackets == ']' && lastOpeningBrackets != '[') {
                    isBalanced = false;
                }
            }
        }

        if(isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
