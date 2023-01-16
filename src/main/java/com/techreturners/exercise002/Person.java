package com.techreturners.exercise002;

public class Person {
    private String first_name;
    private String last_name;
    private String city;
    private int age;

    public Person(String first_name, String last_name, String city, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.age = age;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}