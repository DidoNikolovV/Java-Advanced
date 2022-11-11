import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for(int row = 0; row < size; row++) {
            int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = inputArr;
        }

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        firstDiagonalSum = getFirstDiagonalSum(size, matrix, firstDiagonalSum);


        for(int i = 0; i < size; i++) {
            int row = i;
            int col = size - 1 - i;
            secondDiagonalSum += matrix[row][col];
        }

        System.out.println(Math.abs(firstDiagonalSum- secondDiagonalSum));



    }

    private static int getFirstDiagonalSum(int size, int[][] matrix, int firstDiagonalSum) {
        for(int i = 0; i < size; i++) {
            int row = i;
            int col = i;
            firstDiagonalSum += matrix[row][col];
        }
        return firstDiagonalSum;
    }
}
