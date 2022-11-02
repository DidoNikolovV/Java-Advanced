import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> charsOccurrences = new TreeMap<>();

        String[] input = scanner.nextLine().split("");

        for(String el : input) {
            if(charsOccurrences.get(el) == null) {
                charsOccurrences.put(el, 0);
            }

            int oldCount = charsOccurrences.get(el);
            charsOccurrences.put(el, oldCount + 1);
        }

        for(var entry : charsOccurrences.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }

    }
}
