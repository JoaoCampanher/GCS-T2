import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class StandartFileReader {
    public void readFromFile(String fileName) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), Charset.defaultCharset());
            String line = null;
            while ((line = reader.readLine()) != null) { //read every line of file
            //////////////////////////
            // WRITE YOUR CODE HERE //
            //////////////////////////
            }
            reader.close();
        } catch (IOException e) {
            System.err.format("Error reading File: ", e);
        }
    }
}
