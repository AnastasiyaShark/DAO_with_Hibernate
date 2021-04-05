package ru.netology.demo;


import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<Person> getListByCity(@RequestParam("city") String city) throws IOException {
        return repository.findByCity(city);
    }

    @GetMapping("/by-fullname")
    public Optional<Person> getListByNameAndSurname(@RequestParam("name") String name,
                                                    @RequestParam("surname") String surname) throws IOException {
        return repository.findByNameAndSurname(name, surname);
    }

    @GetMapping("/by-age-less")
    public List<Person> getListByAge(@RequestParam("age") int age) throws IOException {
        return repository.findAllByAgeLessThanOrderByAgeAsc(age);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/count")
    public Long count() {
        return repository.count();
    }

    @PostMapping("/delete-list")
    public void deleteAllPersons(List<Person> personList) {
        repository.deleteAll(personList);
    }


}
