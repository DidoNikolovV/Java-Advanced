import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NestedFolders {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("nested-folder-out.txt"));
            File root = new File("D:\\Java-Advanced\\streams-files-directories\\Files-and-Streams");

           writer.write(Files.walk(root.toPath())
                            .map(Path::toFile)
                                    .map(File::getName)
                                            .collect(Collectors.joining(System.lineSeparator())));
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
