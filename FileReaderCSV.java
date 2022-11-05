import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class FileReaderCSV {
    public void readFromFileCSV(String fileName) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), Charset.defaultCharset());
            String line = null;
            while ((line = reader.readLine()) != null) {
                String v[] = line.split(";");   //separes words in .csv file by ";" (semicolons)
            }
            reader.close();
    
        } catch (IOException e) {
            System.err.format("Error reading file: ", e);
        }
    }
}