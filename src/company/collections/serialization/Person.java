package company.collections.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
