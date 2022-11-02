import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chemicalCount = Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();

        for(int i = 0; i < chemicalCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            for(String el : input) {
                chemicals.add(el);
            }
        }

        for(String el : chemicals) {
            System.out.print(el + " ");
        }
    }
}
