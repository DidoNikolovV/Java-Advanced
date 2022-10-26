import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int numberOfElementsToPush = input[0];
        int numberOfElementsToPop = input[1];
        int numberToCheckIfIsPresented = input[2];

        int[] numbersInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < numberOfElementsToPush; i++) {
            stack.push(numbersInput[i]);
        }

        for(int i = 0; i < numberOfElementsToPop; i++) {
            stack.pop();
        }

        if(stack.contains(numberToCheckIfIsPresented)) {
            System.out.println(true);
        } else if(stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(stack));
        }



    }
}
