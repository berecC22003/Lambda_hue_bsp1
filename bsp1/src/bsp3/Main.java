package bsp3;

public class Main {
    public static void main (String[] args){
        CsvFileReadIn csvFileReadIn = new CsvFileReadIn("sample.csv");
        NumberTester numberTester = new NumberTester();
        csvFileReadIn.readIn("sample.csv", numberTester);
        
    }
}
