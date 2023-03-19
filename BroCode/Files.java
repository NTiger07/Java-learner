package BroCode;

import java.io.File;

public class Files {
    public static void file(String[] args) {
        File file1 = new File("./BroCode/timestamps.txt"); // returns true, "timestamps.txt returns false"

        // file1.delete();

        System.out.println(file1.exists());
    }
}
