package src.week_two.day_four.question4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

    public static void main(String[] args) throws IOException, FileNotFoundException {

        if (args.length < 3 || args.length % 2 == 0) {
            throw new IllegalArgumentException("Invalid arguments. Must specify at least one column and direction.");
        }

        String fileName = args[0];
        if (fileName == null || !fileName.endsWith(".csv")) {
            throw new IllegalArgumentException("Incorrect argument for File Name: " + fileName);
        }

        List<String> columns = new ArrayList<>();
        List<String> directions = new ArrayList<>();

        CSVSorter sorter = new CSVSorter();
        String[][] values = sorter.readCSV(fileName);
        String[] types = values[1];

        List<Comparator<Object[]>> comparators = new ArrayList<>();

        for (int i = 1; i < args.length; i += 2) {
            String columnName = args[i];
            String direction = args[i + 1];

            if (Arrays.asList(values[0]).contains(columnName)) {
                int columnIndex = Arrays.asList(values[0]).indexOf(columnName);
                String dataType = values[1][columnIndex].toLowerCase();
                Comparator<Object[]> comparator = null;

                switch (dataType) {
                    case "string":
                        comparator = Comparator.comparing(row -> (String) row[columnIndex]);
                        break;
                    case "int":
                        comparator = Comparator.comparingInt(row -> Integer.parseInt((String) row[columnIndex]));
                        break;
                    case "double":
                        comparator = Comparator.comparingDouble(row -> Double.parseDouble((String) row[columnIndex]));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type: " + dataType);
                }
                if (direction.equalsIgnoreCase("desc")) {
                    comparator = comparator.reversed();
                }
                comparators.add(comparator);
            } else {
                throw new IllegalArgumentException("Invalid column name: " + columnName);
            }
        }

        Comparator<Object[]> finalComparator = comparators.get(0);
        for (int i = 1; i < comparators.size(); i++) {
            finalComparator = finalComparator.thenComparing(comparators.get(i));
        }

        Arrays.sort(values, 2, values.length, finalComparator);

        int rowsToPrint = Math.min(10, values.length);
        for (int i = 0; i < rowsToPrint; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }
}
