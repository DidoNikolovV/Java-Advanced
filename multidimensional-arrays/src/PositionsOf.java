import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        int searchedNumber = scanner.nextInt();
        boolean isFound = false;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < matrix[r].length ; c++) {
                if(matrix[r][c] == searchedNumber) {
                    isFound = true;
                    System.out.printf("%d %d%n", r, c);
                }
            }
        }

        if(!isFound) {
            System.out.println("not found");
        }


    }
}
