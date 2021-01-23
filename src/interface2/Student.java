package interface2;

import java.util.ArrayList;

public class Student extends Person{

    private String id;

    private ArrayList<String> courses;

    public Student(){

    }

    public Student(String name, String surname, int birthDate, Address address) {
        super(name, surname, birthDate, address);
    }

    public Student(String name, String surname, int birthDate, Address address, String id, ArrayList<String> courses) {
        super(name, surname, birthDate, address);
        this.id = id;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", courses=" + courses +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", address=" + getAddress() +
                "} " + super.toString();
    }
}
