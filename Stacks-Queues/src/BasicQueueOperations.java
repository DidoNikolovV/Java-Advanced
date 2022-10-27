import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputParts = scanner.nextLine().split(" ");
        int numbersToAdd = Integer.parseInt(inputParts[0]);
        int numbersToPoll = Integer.parseInt(inputParts[1]);
        int numbersToCheckIfPresented = Integer.parseInt(inputParts[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < numbersToAdd; i++) {
            queue.offer(numbers[i]);
        }

        for(int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        if(queue.contains(numbersToCheckIfPresented)) {
            System.out.println(true);
        } else if(queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(queue));
        }


    }
}
