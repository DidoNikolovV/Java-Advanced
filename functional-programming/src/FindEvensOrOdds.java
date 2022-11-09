import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = scanner.nextLine();

        int low = range[0];
        int up = range[1];


      Stream<String> stringStream = IntStream.rangeClosed(low, up)
                .boxed()
                .filter(getPredicate(condition))
                .map(e ->
                {
                    System.out.println("Hello from mapper");
                    return String.valueOf(e);
                });

        System.out.println("Before termination");

      String collect = stringStream
              .collect(Collectors.joining(" "));

      System.out.println(collect);

    }

    public static Predicate<Integer> getPredicate(String condition) {
        if(condition.equals("odd")) {
            return n -> n % 2 != 0;
        }
        return n -> n % 2 == 0;
    }
}
