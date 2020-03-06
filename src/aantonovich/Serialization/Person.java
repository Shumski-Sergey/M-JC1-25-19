package aantonovich.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1951800492397446681L;
    private String firstName;
    private String lastName;
    private transient int age ;// пропускает и не сериализует
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
