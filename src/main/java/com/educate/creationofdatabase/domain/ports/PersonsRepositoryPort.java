package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Persons;

public interface PersonsRepositoryPort {
    List<Persons> findAll();
    Optional<Persons> findById(String id);
    Persons save(Persons persons);
    Optional<Persons> update(String id, Persons persons);
    Optional<Persons> deleteById(String id);
}
