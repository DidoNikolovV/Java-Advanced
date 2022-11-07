import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("sorted-out.txt"));

            List<String> lines = Files.readAllLines(Paths.get("input.txt"))
                    .stream()
                    .sorted()
                    .toList();

            for(int i = 0; i < lines.size(); i++) {
                writer.write(lines.get(i));
                writer.newLine();
            }

            writer.close();


        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
