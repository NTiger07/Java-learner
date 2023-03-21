package BroCode.Deserializer;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name, this.password);
    }
}
