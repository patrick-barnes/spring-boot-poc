package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository repo;

    public DataLoader(PersonRepository repo) { this.repo = repo; }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Person("Alice"));
        repo.save(new Person("Bob"));
    }
}
