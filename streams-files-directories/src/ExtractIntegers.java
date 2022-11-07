import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        try {

            FileInputStream inputStream = new FileInputStream("input.txt");
            FileOutputStream outputStream = new FileOutputStream("integers-out.txt");
            Scanner scanner = new Scanner(inputStream);

            PrintWriter writer = new PrintWriter(outputStream);

            while(scanner.hasNext()) {
                if(scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
            writer.close();


        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
