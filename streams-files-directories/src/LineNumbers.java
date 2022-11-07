import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumbers {
    public static void main(String[] args) {
        String path = "D:\\Java-Advanced\\streams-files-directories\\exercises-resources\\inputLineNumbers.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter("line-numbers-output.txt");

            String line = bufferedReader.readLine();

            int count = 0;
            while(line != null) {
                count++;
                writer.write(count + "." + " " + line);
                writer.println();

                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
