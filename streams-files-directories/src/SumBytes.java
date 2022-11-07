import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class SumBytes {
    public static void main(String[] args) {
        String path = "D:\\Java-Advanced\\streams-files-directories\\exercises-resources\\input.txt";

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(path));

            String line = buffReader.readLine();
            long sum = 0;
            while(line != null) {
                for(char c: line.toCharArray()) {
                    sum += c;
                }
                line = buffReader.readLine();
            }

            System.out.println(sum);

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
