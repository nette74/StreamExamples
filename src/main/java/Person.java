import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    public String name;
    public int age;
    public String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
