import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiles {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("list-files-out.txt"));
            File myFile = new File("Files-and-Streams");
            File[] files = myFile.listFiles();

            for(int i = 0; i < files.length; i++) {
                if(!files[i].isDirectory()) {
                    writer.println(files[i].getName() + ": " + "[" + files[i].length() + "]");
                }
            }

            writer.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
