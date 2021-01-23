package interface2;

import java.util.ArrayList;

public class PersonOperationImplement implements PersonOperation{

    private ArrayList<Person> people = new ArrayList<>();

    @Override
    public boolean savePerson(Person person) {

        boolean status = people.add(person);

        return status;
    }

    @Override
    public boolean deletePerson(Person person) {

        boolean status = people.remove(person);

        return status;
    }

    @Override
    public void showPersonInfos(Person person) {

        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Birth Date: " + person.getBirthDate());
        System.out.println("Street: " + person.getAddress().getStreet());
        System.out.println("Neighborhood: " + person.getAddress().getNeighborhood());
        System.out.println("City: " + person.getAddress().getCity());

    }

    @Override
    public void showPersonAddressInfo(Person person) {

        System.out.println(person.getName() + "'s Address Info");
        System.out.println("Street: " + person.getAddress().getStreet());
        System.out.println("Neighborhood: " + person.getAddress().getNeighborhood());
        System.out.println("City: " + person.getAddress().getCity());

    }

    @Override
    public void listPeople() {

        for (Person person : people
             ) {

            System.out.println("************************************************************************");

            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Birth Date: " + person.getBirthDate());
            System.out.println("Street: " + person.getAddress().getStreet());
            System.out.println("Neighborhood: " + person.getAddress().getNeighborhood());
            System.out.println("City: " + person.getAddress().getCity());

            System.out.println("************************************************************************");

        }

    }
}
