package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Persons;
import com.educate.creationofdatabase.domain.ports.PersonsRepositoryPort;

@Service
public class PersonsService {
    private final PersonsRepositoryPort repository;

    public PersonsService(PersonsRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Persons> findAll() {
        return (List<Persons>) repository.findAll();
    }

    public Optional<Persons> findById(String id) {
        return repository.findById(id);
    }

    public Persons save(Persons persons) {
        return repository.save(persons);
    }

    public Persons create(Persons persons) {
        return repository.save(persons);
    }

    public List<Persons> list() {
        return repository.findAll();
    }
   public Optional<Persons> update(String id, Persons persons) {
        return repository.findById(id)
                .map(existing -> {
                    Persons updated = new Persons(
                            existing.getId(),
                            persons.getFirstName(),
                            persons.getLastName(),
                            persons.getCityId()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Persons> delete(String id) {
        return repository.findById(id)
                .map(persons -> {
                    repository.deleteById(id);
                    return persons;
                });
    }
}
