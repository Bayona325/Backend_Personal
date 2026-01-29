package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.TypesEmployees;
import com.educate.creationofdatabase.domain.ports.TypesEmployeesRepositoryPort;

@Service
public class TypesEmployeesService {
    private final TypesEmployeesRepositoryPort repository;

    public TypesEmployeesService(TypesEmployeesRepositoryPort repository) {
        this.repository = repository;
    }
    public List<TypesEmployees> findAll() {
        return (List<TypesEmployees>) repository.findAll();
    }

    public Optional<TypesEmployees> findById(Long id) {
        return repository.findById(id);
    }

    public TypesEmployees save(TypesEmployees typesEmployees) {
        return repository.save(typesEmployees);
    }

    public TypesEmployees create(TypesEmployees typesEmployees) {
        return repository.save(typesEmployees);
    }

    public List<TypesEmployees> list() {
        return repository.findAll();
    }
   public Optional<TypesEmployees> update(Long id, TypesEmployees typesEmployees) {
        return repository.findById(id)
                .map(existing -> {
                    TypesEmployees updated = new TypesEmployees(
                            existing.getId(),
                            typesEmployees.getName()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<TypesEmployees> delete(Long id) {
        return repository.findById(id)
                .map(typesEmployees -> {
                    repository.deleteById(id);
                    return typesEmployees;
                });
    }
}
