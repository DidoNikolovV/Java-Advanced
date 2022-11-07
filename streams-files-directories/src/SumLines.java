import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        String path = "D:\\Java-Advanced\\streams-files-directories\\exercises-resources\\input.txt";

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(path));

            String line = buffReader.readLine();

            while(line != null) {
                long sum = 0;
                for(char c : line.toCharArray()) {
                    sum += c;
                }

                System.out.println(sum);
                line = buffReader.readLine();
            }


        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
