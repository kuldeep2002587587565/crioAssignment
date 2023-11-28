import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private int age;
    private String email;

    // Default constructor (required for Jackson)
    public User() {
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Jackson annotation for mapping JSON property "name" to the Java field "name"
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Jackson annotation for mapping JSON property "age" to the Java field "age"
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    // Jackson annotation for mapping JSON property "email" to the Java field "email"

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

