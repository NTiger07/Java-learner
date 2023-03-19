package BroCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader {
    public static void fileReader(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt");
            int data = fileReader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
