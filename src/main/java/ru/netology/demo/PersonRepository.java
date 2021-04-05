package ru.netology.demo;


import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;


public interface PersonRepository extends JpaRepository<Person, PersonId> {

    //создайте метод, который будет принимать название города(city) и
    // возвращать Entity из базы данных, которые соответствуют этому city.
    List<Person> findByCity(String city);

    //создайте метод, который будет принимать имя и фамилию(name и surname) и возвращать Entity из базы данных,
    // которые соответствуют сочетанию name и surname и является Optional.
    Optional<Person> findByNameAndSurname(String name, String surname);

    //создайте метод, который будет принимать возраст(age) и возвращать Entity из базы данных,
    // которые меньше переданного age и отсортированы по возрастанию.
    List<Person> findAllByAgeLessThanOrderByAgeAsc(int age);


}
