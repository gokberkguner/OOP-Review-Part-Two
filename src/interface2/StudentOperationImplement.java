package interface2;

import java.util.ArrayList;

public class StudentOperationImplement implements StudentOperation{

    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean saveStudent(Student student) {
        return students.add(student);
    }

    @Override
    public boolean deleteStudent(Student student) {
        return students.remove(student);
    }

    @Override
    public void showStudentInfos(Student student) {
        System.out.println(student);
    }
}
