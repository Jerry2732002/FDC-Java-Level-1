package src.week_two.day_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCheckReader {
    private File checkFile(String fileName) throws FileNotFoundException {
        File file =new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException("No file by name " + fileName + " found");
        }
        return file;
    }
    public void readFile(String fileName) throws IOException{
        FileReader reader = null;
        try {
            File file = checkFile(fileName);
            reader = new FileReader(file);
            int ch;
            int i = 0;
            while ((ch = (int)reader.read()) != -1){
                if((char)ch != ' ') {
                    System.out.print((char)ch);
                }else {
                    i++;
                    System.out.println();
                }
                if (i == 3) {
                    break;
                }
            }
        } finally {
            try {
               if(reader != null) {
                   reader.close();
               }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
