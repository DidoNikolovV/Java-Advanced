import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {

        String path = "input.txt";
        String newFile = "out.txt";

        Set<Character> punctuation = new HashSet<>();
        punctuation.add(',');
        punctuation.add('.');
        punctuation.add('!');
        punctuation.add('?');

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream out = new FileOutputStream(newFile);
            int oneByte = fileInputStream.read();
            while(oneByte > 0) {
                if(!punctuation.contains((char) oneByte)) {
                    out.write(oneByte);
                }
                oneByte = fileInputStream.read();
            }
            fileInputStream.close();
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
