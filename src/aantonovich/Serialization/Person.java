package aantonovich.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1951800492397446681L;
    private transient int age = Integer.MAX_VALUE;// пропускает и не сериализует
    public Person(String firstName, String lastName, int age) {
    }
}
