package BroCode.Serializer;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name, this.password);
    }
}
