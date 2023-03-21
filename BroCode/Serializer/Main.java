package BroCode.Serializer;

public class Main {
    // Steps to Serialize
    // Object class should implement Serializable interface
    // FileOutputStream fileout = new FileOutputStream(file_path)
    // ObjectOutputStream out = new ObjectOutputStream(fileout)
    // out.writeObject(object_name)
    // out.close(); fileOut.close();

    public static void main(String[] args) {

        User user1 = new User("Beckham", "davidbeckham724");

        System.out.println(user1.getName());
        System.out.println(user1.getPassword());
    }

}
