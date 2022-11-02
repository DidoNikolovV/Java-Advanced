import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = input[0];
        int m = input[1];
        int totalCount = n + m;

        Set<Integer> nSet = new LinkedHashSet<>();
        Set<Integer> mSet = new LinkedHashSet<>();

        for(int i = 0; i < totalCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(i < n) {
                nSet.add(number);
            } else {

                mSet.add(number);
            }
        }

        if(nSet.size() > mSet.size()) {
            for(int num : nSet) {
                if (mSet.contains(num)) {
                    System.out.print(num + " ");
                }
            }
        } else {
            for(int num : mSet) {
                if(nSet.contains(num)) {
                    System.out.print(num + " ");
                }
            }
        }


    }
}
