import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbersOccurrences = new LinkedHashMap<>();

        for(double num : input) {
            if(numbersOccurrences.get(num) == null) {
                numbersOccurrences.put(num, 0);
            }

            int newCount = numbersOccurrences.get(num) + 1;
            numbersOccurrences.put(num, newCount);
        }

        for(var entry: numbersOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
