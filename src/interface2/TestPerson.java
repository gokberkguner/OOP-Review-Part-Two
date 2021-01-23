package interface2;

import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {

        Student student1 = new Student("Gökberk","Güner",2000,null);

        Address address1 = new Address("Koru Street","Levazım Neighborhood","Istanbul");

        student1.setAddress(address1);
        student1.setId("180209017");

        ArrayList<String> courses1 = new ArrayList<>();
        courses1.add("Data Structures");
        courses1.add("Computer Architecture");
        courses1.add("Object Oriented Programming");

        student1.setCourses(courses1);

        ArrayList<String> courses2 = new ArrayList<>();
        courses2.add("History");
        courses2.add("Turkish");
        courses2.add("Geograhpy");

        Student student2 = new Student("Ali","Veli",2001,address1,"180209018",courses2);

        Address address2 = new Address("Yıldız Street","Can Neighborhood","Ankara");

        Student student3 = new Student("Ahmet","Yılmaz",2001,address2,"18020919",courses2);


        Teacher teacher1 = new Teacher("Mehmet","Yıldız",2000,null);

        Address address3 = new Address("Gül Street","Kazım Neighborhood","İzmir");

        teacher1.setAddress(address3);

        PersonOperationImplement personOperationImplement = new PersonOperationImplement();

        personOperationImplement.savePerson(teacher1);
        personOperationImplement.savePerson(student1);
        personOperationImplement.savePerson(student2);
        personOperationImplement.savePerson(student3);

        personOperationImplement.listPeople();

    }
}
