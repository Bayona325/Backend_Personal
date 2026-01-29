package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Companies;
import com.educate.creationofdatabase.domain.ports.CompaniesRepositoryPort;

@Service
public class CompaniesService {
    private final CompaniesRepositoryPort repository;

    public CompaniesService(CompaniesRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Companies> findAll() {
        return (List<Companies>) repository.findAll();
    }

    public Optional<Companies> findById(String nui) {
        return repository.findById(nui);
    }

    public Companies save(Companies companies) {
        return repository.save(companies);
    }

    public Companies create(Companies companies) {
        return repository.save(companies);
    }

    public List<Companies> list() {
        return repository.findAll();
    }
   public Optional<Companies> update(String nui, Companies companies) {
        return repository.findById(nui)
                .map(existing -> {
                    Companies updated = new Companies(
                            existing.getNui(),
                            companies.getName(),
                            companies.getCityId(),
                            companies.getContactName(),
                            companies.getEmailcorp(),
                            companies.getEmailContact()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Companies> delete(String nui) {
        return repository.findById(nui)
                .map(companies -> {
                    repository.deleteById(nui);
                    return companies;
                });
    }
}
