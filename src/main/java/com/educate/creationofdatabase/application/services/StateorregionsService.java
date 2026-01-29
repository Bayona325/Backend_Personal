package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Stateorregions;
import com.educate.creationofdatabase.domain.ports.StateorregionsRepositoryPort;

@Service
public class StateorregionsService {
    private final StateorregionsRepositoryPort repository;

    public StateorregionsService(StateorregionsRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Stateorregions> findAll() {
        return (List<Stateorregions>) repository.findAll();
    }

    public Optional<Stateorregions> findById(String code) {
        return repository.findById(code);
    }

    public Stateorregions save(Stateorregions stateorregions) {
        return repository.save(stateorregions);
    }

    public Stateorregions create(Stateorregions stateorregions) {
        return repository.save(stateorregions);
    }

    public List<Stateorregions> list() {
        return repository.findAll();
    }
   public Optional<Stateorregions> update(String code, Stateorregions stateorregions) {
        return repository.findById(code)
                .map(existing -> {
                    Stateorregions updated = new Stateorregions(
                            existing.getCode(),
                            stateorregions.getName(),
                            stateorregions.getCountryId(),
                            stateorregions.getCode1()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Stateorregions> delete(String id) {
        return repository.findById(id)
                .map(stateorregions -> {
                    repository.deleteById(id);
                    return stateorregions;
                });
    }
}
