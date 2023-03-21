package BroCode.Serializer;

import java.io.*;

public class Main {
    // Steps to Serialize
    // Object class should implement Serializable interface
    // FileOutputStream fileout = new FileOutputStream(file_path)
    // ObjectOutputStream out = new ObjectOutputStream(fileout)
    // out.writeObject(object_name)
    // out.close(); fileOut.close();

    public static void main(String[] args) throws IOException {

        User user1 = new User("Beckham", "davidbeckham724");

        FileOutputStream fileOut = new FileOutputStream("./BroCode/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user1);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!");

    }

}
