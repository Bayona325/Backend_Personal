package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Eps;
import com.educate.creationofdatabase.domain.ports.EpsRepositoryPort;

@Service
public class EpsService {
    private final EpsRepositoryPort repository;

    public EpsService(EpsRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Eps> findAll() {
        return (List<Eps>) repository.findAll();
    }

    public Optional<Eps> findById(Long id) {
        return repository.findById(id);
    }

    public Eps save(Eps eps) {
        return repository.save(eps);
    }

    public Eps create(Eps eps) {
        return repository.save(eps);
    }

    public List<Eps> list() {
        return repository.findAll();
    }
   public Optional<Eps> update(Long id, Eps eps) {
        return repository.findById(id)
                .map(existing -> {
                    Eps updated = new Eps(
                            existing.getId(),
                            eps.getName()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Eps> delete(Long id) {
        return repository.findById(id)
                .map(eps -> {
                    repository.deleteById(id);
                    return eps;
                });
    }
}
