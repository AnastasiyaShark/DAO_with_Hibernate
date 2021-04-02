package ru.netology.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Persons")
public class Person implements Serializable {

    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;

    private String phone_number;

    private String city_of_living;

    public Person() {
    }

    public Person(String name, String surName, int age, String phone_number, String city_of_living) {
        this.name = name;
        this.surname = surName;
        this.age = age;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity_of_living() {
        return city_of_living;
    }

    public void setCity_of_living(String city_of_living) {
        this.city_of_living = city_of_living;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                ", city_of_living='" + city_of_living + '\'' +
                '}';
    }
}
