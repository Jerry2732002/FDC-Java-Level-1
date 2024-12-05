package src.week_two.day_four.question4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;


public class CSVSorter {

    public String[][] readCSV(String fileName) throws FileNotFoundException {
        int rowNo = 1;
        int columnNo = 0;
        String[] values;
        // first try catch to get the number of rows and columns
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] intial = reader.readNext();
            columnNo = intial.length;
            while (reader.readNext() != null) {
                rowNo++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[][] valueMatrix = new String[rowNo][columnNo];
            int i = 0;
            while ((values = reader.readNext()) != null) {
                for (int j = 0; j < columnNo; j++) {
                    valueMatrix[i][j] = values[j];
                }
                i++;
            }
            return valueMatrix;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        if (fileName == null || !fileName.contains(".csv")) {
            throw new IllegalArgumentException("Incorrect argument for File Name :" + fileName);
        }
        List<String> columns = new ArrayList<>();
        List<String> directions = new ArrayList<>();

        CSVSorter sorter = new CSVSorter();
        String[][] values = sorter.readCSV("employee_data.csv");

        for (int i = 1; i < args.length; i += 2) {
            if (Arrays.asList(values[0]).contains(args[i])) {
                if (args[i + 1].equalsIgnoreCase("desc") || args[i + 1].equalsIgnoreCase("asc")) {
                    if (args[i + 1].equalsIgnoreCase("asc")) {

                    }
                }
                else {
                    throw new IllegalArgumentException("Invalid direction:" + args[i+1]);
                }
            } else {
                throw new IllegalArgumentException("Invalid row name:" + args[i]);
            }
        }

    }
}
