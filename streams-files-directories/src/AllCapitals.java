import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AllCapitals {
    public static void main(String[] args) {
        String path = "D:\\Java-Advanced\\streams-files-directories\\exercises-resources\\input.txt";

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter("output.txt");

            String line = buffReader.readLine();

            while(line != null) {
                writer.write(line.toUpperCase());
                writer.println();

                line = buffReader.readLine();
            }

            buffReader.close();
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
