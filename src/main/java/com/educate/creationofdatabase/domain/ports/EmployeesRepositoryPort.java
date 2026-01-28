package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Employees;

public interface EmployeesRepositoryPort {
    List<Employees> findAll();
    Optional<Employees> findById(Long id);
    Employees save(Employees employees);
    Optional<Employees> update(Long id, Employees employees);
    Optional<Employees> deleteById(Long id);
}
