import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeAndPattern = scanner.nextLine().split(", ");
        int size = Integer.parseInt(sizeAndPattern[0]);
        String pattern = sizeAndPattern[1];

        int[][] matrix = new int[size][size];

        int counter = 1;
        if(pattern.equals("A")) {
            for(int col = 0; col < size; col++) {
                for(int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        } else if(pattern.equals("B")) {
            for(int col = 0; col < size; col++) {
                if(col % 2 == 0) {
                    for(int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                } else {
                    for(int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                }

            }
        }

        for(int[] row : matrix) {
            for(int el: row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
