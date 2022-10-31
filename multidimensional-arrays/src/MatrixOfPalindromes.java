import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];

        for(int row = 0; row < rows; row++) {
            char firstLetter = (char) (row + 97);
            char lastLetter = (char)(row + 97);
            for(int col = 0; col < cols; col++) {
                StringBuilder palindrome = new StringBuilder();
                char middleLetter = (char)((int)firstLetter + col);
                palindrome.append(firstLetter);
                palindrome.append(middleLetter);
                palindrome.append(lastLetter);
                matrix[row][col] = palindrome.toString();
            }
        }

        for(String[] row: matrix) {
            for(String el: row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
