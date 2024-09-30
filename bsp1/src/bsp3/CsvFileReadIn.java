package bsp3;

import java.io.*;

public class CsvFileReadIn {
    private final String filename;

    public CsvFileReadIn(String filename) {
        this.filename = filename;
    }

    public void readIn(String filename, NumberTester numberTester)  {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            int numberOfTestcases = Integer.parseInt(br.readLine());
            for(int i = 0; i<numberOfTestcases; i++){
                String line = br.readLine();
                String[] parts = line.split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);

                numberTester.testFile(testType, number);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage() + "Fehler in der readIn Methode");
        }
    }
}
