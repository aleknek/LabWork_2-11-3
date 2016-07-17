package com.brainacad.oop.testexcp1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Иванов");
        person.setLastName("Иван");

        try {
            person.setAge(150);
        } catch (InvalidAgeException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }
}
