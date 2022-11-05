import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;


public class FileReaderTXT {
    public void readFromFileTXT(String fileName) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), Charset.defaultCharset());
            String line = null;
            while ((line = reader.readLine()) != null) {
                String v[] = line.split(" ");   //separes words in .txt file lines by " " (empty spaces)
            }
            reader.close();
    
        } catch (IOException e) {
            System.err.format("Error reading file: ", e);
        }
    }
}

