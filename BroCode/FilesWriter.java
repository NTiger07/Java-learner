package BroCode;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Roses are red \nViolets are blue \nYou're a cunt\n");
            fileWriter.append("(Poem by Favour)");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
