package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class YamlReader {

    public List<Person> readPersons() {
        String fileName = "persons.yaml";

        InputStream input = YamlReader.class.getClassLoader().getResourceAsStream(fileName);
        Yaml yaml = new Yaml();
        List<Map<String, Object>> rawList = yaml.load(input);
        List<Person> persons = new ArrayList<>();
        
        for (Map<String, Object> map : rawList) {
            Person person = new Person();
            person.setName((String) map.get("name"));
            person.setAddress((String) map.get("address"));
            persons.add(person);
        }
        return persons;
    }
}