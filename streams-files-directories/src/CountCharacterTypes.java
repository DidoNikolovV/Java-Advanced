import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String path = "D:\\Java-Advanced\\streams-files-directories\\exercises-resources\\input.txt";
        int vowelsCount = 0;
        int punctuationCount = 0;
        int symbolsCount = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter("count-chars-output.txt");

            String line = bufferedReader.readLine();

            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            Set<Character> punctuation = Set.of('!', ',', '.', '?');

            while(line != null) {
                for(char c: line.toCharArray()) {
                    if(c == ' ') {
                        continue;
                    } else if(vowels.contains(c)) {
                        vowelsCount++;
                    } else if(punctuation.contains(c)) {
                        punctuationCount++;
                    } else {
                        symbolsCount++;
                    }
                }

                line = bufferedReader.readLine();
            }

            writer.write("Vowels: " + vowelsCount);
            writer.println();
            writer.write("Other symbols: " + symbolsCount);
            writer.println();
            writer.write("Punctuation: " + punctuationCount);

            bufferedReader.close();
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
