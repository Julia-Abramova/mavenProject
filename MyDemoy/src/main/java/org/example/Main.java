package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        YamlReader reader = new YamlReader();

        List<Person> persons = reader.readPersons();

        if (persons.isEmpty())
            System.out.println("The list is empty");
        else 
            for (Person p : persons) 
                System.out.println(p);
    }
}