import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];

        for(int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();

        while(!command.equals("END")) {
            String[] cmdParts = command.split(" ");
            String cmdType = cmdParts[0];
            if(!cmdType.equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                if(cmdParts.length > 5) {
                    System.out.println("Invalid input!");
                } else {
                    int firstElementRow = Integer.parseInt(cmdParts[1]);
                    int firstElementCol = Integer.parseInt(cmdParts[2]);
                    int secondElementRow = Integer.parseInt(cmdParts[3]);
                    int secondElementCol = Integer.parseInt(cmdParts[4]);

                    if((firstElementRow >=0 && firstElementRow < rows)  && (firstElementCol >=0 && firstElementCol < cols) &&(secondElementRow >=0 && secondElementRow < rows)  && (secondElementCol >=0 && secondElementCol < cols)) {
                        String firstElement = matrix[firstElementRow][firstElementCol];
                        String secondElement = matrix[secondElementRow][secondElementCol];

                        matrix[firstElementRow][firstElementCol] = secondElement;
                        matrix[secondElementRow][secondElementCol] = firstElement;
                        for(String[] arr: matrix) {
                            for(String el: arr) {
                                System.out.print(el + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid input!");
                    }
                }

            }
            command = scanner.nextLine();
        }


    }
}
