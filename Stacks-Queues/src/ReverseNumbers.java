import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(Integer el: input) {
            numbers.push(el);
        }

        for(Integer num: numbers) {
            System.out.printf("%d ", num);
        }
    }
}
