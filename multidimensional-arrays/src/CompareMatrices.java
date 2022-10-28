import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] firstMatrix = new int[rows][cols];

        for(int row = 0; row < firstMatrix.length; row++) {
            for(int col = 0; col < cols; col++) {
                firstMatrix[row][col] = scanner.nextInt();
            }
        }

        rows = scanner.nextInt();
        cols = scanner.nextInt();

        int[][] secondMatrix = new int[rows][cols];

        for(int row = 0; row < secondMatrix.length; row++) {
            for(int col = 0; col < secondMatrix[row].length; col++) {
                secondMatrix[row][col] = scanner.nextInt();
            }
        }

        boolean areEqual = firstMatrix.length == secondMatrix.length
                && arraysAreEqual(firstMatrix, secondMatrix);

        System.out.println(areEqual ? "equal" : "not equal");

    }

    public static boolean arraysAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        for(int r = 0; r < firstMatrix.length; r++)  {

            int[] firstArr = firstMatrix[r];
            int[] secondArr = secondMatrix[r];

            if(firstArr.length != secondArr.length) {
                return false;
            }

            for(int i = 0; i < firstArr.length; i++) {
                int firstNumber = firstArr[i];
                int secondNumber = secondArr[i];

                if(firstNumber != secondNumber) {
                    return  false;
                }
            }
        }

        return true;
    }
}
