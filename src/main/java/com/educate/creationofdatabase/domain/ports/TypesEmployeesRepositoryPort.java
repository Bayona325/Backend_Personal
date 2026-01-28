package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.TypesEmployees;

public interface TypesEmployeesRepositoryPort {
    List<TypesEmployees> findAll();
    Optional<TypesEmployees> findById(Long id);
    TypesEmployees save(TypesEmployees typesEmployees);
    Optional<TypesEmployees> update(Long id, TypesEmployees typesEmployees);
    Optional<TypesEmployees> deleteById(Long id);
}
