package bsp3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CsvFileReadIn {
    String line;
    int[] whichTest;
    int[] testNumbers;

    public String readIn(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        bufferedReader.readLine();

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\s+");
            whichTest[0] = Integer.parseInt(values[0]);
            testNumbers[1] = Integer.parseInt(values[1]);
        }
        
    }
}
