package com.java8.Optionals;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

public class PersonRepository {
    private final Map<Integer, Person> personDatabase = new HashMap<>();

    public PersonRepository() {
        // Simulating some data
        personDatabase.put(1, new Person(1, "John Doe", "john.doe@example.com"));
        personDatabase.put(2, new Person(2, "Jane Smith", "jane.smith@example.com"));
    }

    public Optional<Person> findById(int id) {
        return Optional.ofNullable(personDatabase.get(id));
    }

    public Optional<String> findEmailById(int id) {
        return findById(id).map(Person::getEmail);
    }
}

