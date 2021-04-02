package ru.netology.demo;


import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;


@Repository
public class DatabaseRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery
                ("select p from Person p where p.city_of_living = '" + city + "'", Person.class)
                .getResultList();
    }


}
