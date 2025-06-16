// Person Class
public class Person {
    // common attributes...
    protected String name;
    protected String phoneNumber;

    // Non-default Construtor For Person
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Construtor For Person
    public Person() {
        this.name = "";
        this.phoneNumber = "";
    }

    // getters and setters...
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // getters and setters...
    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhone() {
        return phoneNumber;
    }
}