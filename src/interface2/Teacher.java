package interface2;

public class Teacher extends Person{

    private String major;

    public Teacher(){

    }

    public Teacher(String name, String surname, int birthDate, Address address) {
        super(name, surname, birthDate, address);
    }

    public Teacher(String name, String surname, int birthDate, Address address, String major) {
        super(name, surname, birthDate, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "major='" + major + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", address=" + getAddress() +
                "} " + super.toString();
    }
}
