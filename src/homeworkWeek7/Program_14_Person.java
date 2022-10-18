package homeworkWeek7;

public class Program_14_Person {

    public static void main(String[] args) {
        Program_14_Person person = new Program_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName=" + person.getFullName());
    }
    String firstName, lastName;
    int age;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
}

