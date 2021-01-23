package interface2;

import java.util.ArrayList;

public class TeacherOperationImplement implements TeacherOperation{

    private ArrayList<Teacher> teachers = new ArrayList<>();

    @Override
    public boolean saveTeacher(Teacher teacher) {
        return teachers.add(teacher);
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        return teachers.remove(teacher);
    }

    @Override
    public void showTeacherInfos(Teacher teacher) {
        System.out.println(teacher);
    }
}
