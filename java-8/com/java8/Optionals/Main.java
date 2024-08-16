package com.java8.Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();

        // Fetching a person by ID
        Optional<Person> person = repository.findById(1);
        person.ifPresentOrElse(
                p -> System.out.println("Found person: " + p),
                () -> System.out.println("Person not found")
        );

        // Fetching email by ID
        Optional<String> email = repository.findEmailById(1);
        email.ifPresentOrElse(
                e -> System.out.println("Found email: " + e),
                () -> System.out.println("Email not found")
        );

        // Trying to fetch a non-existing person
        Optional<Person> nonExistentPerson = repository.findById(3);
        System.out.println("Non-existent person: " + nonExistentPerson.orElseGet(() -> new Person(0, "Default Name", "default@example.com")));

        // Handling potential null with default value
        String emailOrDefault = repository.findEmailById(3).orElse("no-email@example.com");
        System.out.println("Email or default: " + emailOrDefault);
    }
}
