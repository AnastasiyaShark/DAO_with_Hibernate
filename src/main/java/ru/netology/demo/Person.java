package ru.netology.demo;

import javax.persistence.*;

@Entity
@Table(name = "Persons")
@IdClass(PersonId.class)
public class Person {

    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;

    private String phone;

    private String city;

    public Person() {
    }

    public Person(String name, String surname, int age, String phone, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.city = city;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
