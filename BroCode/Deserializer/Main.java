package BroCode.Deserializer;

import java.io.*;
import BroCode.Serializer.User;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user1 = null;

        FileInputStream fileIn = new FileInputStream("./BroCode/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user1 = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user1);
        System.out.println("Object info loaded!");
    }
}
