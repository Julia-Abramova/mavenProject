package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reading list of persons from YAML \n");

        YamlReader reader = new YamlReader();

        try {
            List<Person> persons = reader.readPersons();

            System.out.println("Found records: " + persons.size());

            if (persons.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                for (Person p : persons) {
                    System.out.println(p);
                }
            }

        } catch (Exception e) {
            System.err.println("Error while working with YAML:");
            e.printStackTrace();
        }
    }
}