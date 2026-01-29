package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.PensionFunds;
import com.educate.creationofdatabase.domain.ports.PensionFundsRepositoryPort;

@Service
public class PensionFundsService {
    private final PensionFundsRepositoryPort repository;

    public PensionFundsService(PensionFundsRepositoryPort repository) {
        this.repository = repository;
    }
    public List<PensionFunds> findAll() {
        return (List<PensionFunds>) repository.findAll();
    }

    public Optional<PensionFunds> findById(Long id) {
        return repository.findById(id);
    }

    public PensionFunds save(PensionFunds pensionFunds) {
        return repository.save(pensionFunds);
    }

    public PensionFunds create(PensionFunds pensionFunds) {
        return repository.save(pensionFunds);
    }

    public List<PensionFunds> list() {
        return repository.findAll();
    }
   public Optional<PensionFunds> update(Long id, PensionFunds pensionFunds) {
        return repository.findById(id)
                .map(existing -> {
                    PensionFunds updated = new PensionFunds(
                            existing.getId(),
                            pensionFunds.getName()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<PensionFunds> delete(Long id) {
        return repository.findById(id)
                .map(pensionFunds -> {
                    repository.deleteById(id);
                    return pensionFunds;
                });
    }
}
