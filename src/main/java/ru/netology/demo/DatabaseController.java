package ru.netology.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DatabaseController {

    private final DatabaseRepository repository;

    public DatabaseController(DatabaseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getListProductName(@RequestParam("city") String city) throws IOException {
        return repository.getPersonsByCity(city);
    }
}
