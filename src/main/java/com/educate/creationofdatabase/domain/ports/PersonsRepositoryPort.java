package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Persons;

public interface PersonsRepositoryPort {
    List<Persons> findAll();
    Optional<Persons> findById(Long id);
    Persons save(Persons persons);
    Optional<Persons> update(Long id, Persons persons);
    Optional<Persons> deleteById(Long id);
}
