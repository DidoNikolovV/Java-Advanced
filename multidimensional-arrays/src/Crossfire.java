import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][];

        int counter = 1;
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                matrix[row][col] = String.valueOf(counter++);
            }
        }


        String command = scanner.nextLine();

        int leftCounter = 0;
        int rightCounter = 0;
        int upCounter = 0;
        int downCounter = 0;

        while(!command.equals("Nuke it from orbit")) {
            int[] cmdParts = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = cmdParts[0];
            int col = cmdParts[1];
            int radius = cmdParts[2];

            // Destroy left
            for(int c = col; c >=0 && leftCounter <= radius; c--, leftCounter++) {
                matrix[row][c] = " ";
            }

            // Destroy right
            for(int c = col; c <cols && rightCounter <= radius; c++, rightCounter++) {
                matrix[row][c] = " ";
            }

            // Destroy up
            for(int r = row; r >= 0 && upCounter <= radius; r--, upCounter++) {
                matrix[r][col] = " ";
            }

            // Destroy down
            for(int r = row; r < rows && downCounter <= radius; r++, downCounter++) {
                matrix[r][col] = " ";
            }

            command = scanner.nextLine();
        }



    }


}
