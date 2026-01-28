package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Arl;
import com.educate.creationofdatabase.domain.ports.ArlRepositoryPort;

@Service
public class ArlService {
    private final ArlRepositoryPort repository;

    public ArlService(ArlRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Arl> findAll() {
        return (List<Arl>) repository.findAll();
    }

    public Optional<Arl> findById(Long id) {
        return repository.findById(id);
    }

    public Arl save(Arl arl) {
        return repository.save(arl);
    }

    public Arl create(Arl arl) {
        return repository.save(arl);
    }

    public List<Arl> list() {
        return repository.findAll();
    }
   public Optional<Arl> update(Long id, Arl arl) {
        return repository.findById(id)
                .map(existing -> {
                    Arl updated = new Arl(
                            existing.getId(),
                            arl.getName()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Arl> delete(Long id) {
        return repository.findById(id)
                .map(arl -> {
                    repository.deleteById(id);
                    return arl;
                });
    }
}
