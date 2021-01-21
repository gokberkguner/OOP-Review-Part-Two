package extendSuper;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Gökberk","Güner",2000,"180209017",null);

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Data Structures");
        courses.add("Computer Architecture");
        courses.add("Object Oriented Programming - 1");

        student1.setCourses(courses);

        System.out.println(student1.toString());

    }
}
