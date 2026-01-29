package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Countries;
import com.educate.creationofdatabase.domain.ports.CountriesRepositoryPort;

@Service
public class CountriesService {
    private final CountriesRepositoryPort repository;

    public CountriesService(CountriesRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Countries> findAll() {
        return (List<Countries>) repository.findAll();
    }

    public Optional<Countries> findById(String id) {
        return repository.findById(id);
    }

    public Countries save(Countries countries) {
        return repository.save(countries);
    }

    public Countries create(Countries countries) {
        return repository.save(countries);
    }

    public List<Countries> list() {
        return repository.findAll();
    }
   public Optional<Countries> update(String id, Countries countries) {
        return repository.findById(id)
                .map(existing -> {
                    Countries updated = new Countries(
                            existing.getId(),
                            countries.getIsocode(),
                            countries.getName()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Countries> delete(String id) {
        return repository.findById(id)
                .map(countries -> {
                    repository.deleteById(id);
                    return countries;
                });
    }
}
