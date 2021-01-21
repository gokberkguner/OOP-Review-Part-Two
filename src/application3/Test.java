package application3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Gökberk","Güner",2000,"180209017",null);

        Address address1 = new Address("3","Koru Street","Levazım Neighborhood","Besiktas","Istanbul");

        student1.setAddress(address1);

        showAllStudentInfos(student1);
    }

    public static void showAllStudentInfos(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("ID: " + student.getId());

        Address address = student.getAddress();
        System.out.println("- " + student.getSurname() + "'s Address Infos -");
        System.out.println("City: " + address.getCity());
        System.out.println("District: " + address.getDistrict());
        System.out.println("Street: " + address.getStreet());
        System.out.println("Neigborhood: " + address.getNeighborhood());
        System.out.println("Home No: " + address.getHomeNo());
    }
}
