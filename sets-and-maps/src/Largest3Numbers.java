import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        int counter = 1;
        for(int i = 0; i < numbers.size(); i++) {
            if(counter > 3) {
                break;
            }
            System.out.print(numbers.get(i) + " ");
            counter++;
        }

    }
}
