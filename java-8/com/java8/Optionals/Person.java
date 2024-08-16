package com.java8.Optionals;

public class Person {
    private final int id;
    private final String name;
    private final String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}

