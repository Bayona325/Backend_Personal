package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Employees;
import com.educate.creationofdatabase.domain.ports.EmployeesRepositoryPort;

@Service
public class EmployeesService {
    private final EmployeesRepositoryPort repository;

    public EmployeesService(EmployeesRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Employees> findAll() {
        return (List<Employees>) repository.findAll();
    }

    public Optional<Employees> findById(Long id) {
        return repository.findById(id);
    }

    public Employees save(Employees employees) {
        return repository.save(employees);
    }

    public Employees create(Employees employees) {
        return repository.save(employees);
    }

    public List<Employees> list() {
        return repository.findAll();
    }
   public Optional<Employees> update(Long id, Employees employees) {
        return repository.findById(id)
                .map(existing -> {
                    Employees updated = new Employees(
                            existing.getId(),
                            employees.getPersonId(),
                            employees.getDateBirth(),
                            employees.getEpsId(),
                            employees.getArlId(),
                            employees.getPensionfundId(),
                            employees.getTypeemployeeId()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Employees> delete(Long id) {
        return repository.findById(id)
                .map(employees -> {
                    repository.deleteById(id);
                    return employees;
                });
    }
}
