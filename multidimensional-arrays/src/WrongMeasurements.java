import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for(int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int wrongValue = matrix[scanner.nextInt()][scanner.nextInt()];


        int newValue = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                int currentValue = matrix[row][col];
                if(currentValue == wrongValue) {
                    if(isInBounds(row-1, col, matrix) && matrix[row-1][col] != wrongValue) {
                        newValue+= matrix[row-1][col];
                    }
                    if(isInBounds(row, col + 1, matrix) && matrix[row][col + 1] != wrongValue) {
                        newValue += matrix[row][col +1];
                    }

                }
            }
        }
    }

    private static boolean isInBounds(int row, int col, int[][]matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static boolean isOutOfBounds(int row, int col, int[][]matrix) {
       return !isInBounds(row, col, matrix);
    }

}
