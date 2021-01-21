package application3;

import java.util.ArrayList;

public class Student {

    private String name;

    private String surname;

    private int birthDate;

    private String id;

    private Address address;

    public Student(){

    }

    public Student(String name, String surname, int birthDate, String id, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
