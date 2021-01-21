package extendSuper;

import java.util.ArrayList;

public class Student extends Person{

    private String id;

    private ArrayList<String> courses;

    public Student(){

    }

    public Student(String name, String surname, int birthDate, String id, ArrayList<String> courses) {
        super(name, surname, birthDate);
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
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", id='" + id + '\'' +
                ", courses=" + courses +
                "} " + super.toString();
    }
}
