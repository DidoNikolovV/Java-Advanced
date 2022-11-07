import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("input.txt");
            BufferedReader buffReader = new BufferedReader(fReader);

            BufferedWriter writer = new BufferedWriter(new FileWriter("every-third-line-out.txt"));

            int counter = 0;
            String line = buffReader.readLine();
            while(line != null) {
                counter++;
                if(counter % 3 == 0) {
                    writer.write(line);
                    writer.newLine();
                }

                line = buffReader.readLine();
            }

            buffReader.close();
            writer.close();



        } catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
