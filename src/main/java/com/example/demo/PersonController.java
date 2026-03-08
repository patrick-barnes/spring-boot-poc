package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Person> list() { return repo.findAll(); }

    @PostMapping
    public Person create(@RequestBody Person p) { return repo.save(p); }
}
