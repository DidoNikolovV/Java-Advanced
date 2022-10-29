import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }


        for(int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }

        System.out.println();


        for(int row = matrix.length - 1; row >=0; row--) {
            System.out.print(matrix[row][matrix.length - 1 - row] + " ");
        }

    }
}
