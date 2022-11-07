import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            int read = inputStream.read();

            PrintWriter writer = new PrintWriter(outputStream);

            while(read != -1) {
                if(read == 32) {
                    writer.print(' ');
                } else if(read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }

                read = inputStream.read();
            }
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
