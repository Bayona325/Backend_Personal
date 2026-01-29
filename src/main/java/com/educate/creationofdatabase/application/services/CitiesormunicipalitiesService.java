package com.educate.creationofdatabase.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educate.creationofdatabase.domain.model.Citiesormunicipalities;
import com.educate.creationofdatabase.domain.ports.CitiesormunicipalitiesRepositoryPort;

@Service
public class CitiesormunicipalitiesService {
    private final CitiesormunicipalitiesRepositoryPort repository;

    public CitiesormunicipalitiesService(CitiesormunicipalitiesRepositoryPort repository) {
        this.repository = repository;
    }
    public List<Citiesormunicipalities> findAll() {
        return (List<Citiesormunicipalities>) repository.findAll();
    }

    public Optional<Citiesormunicipalities> findById(Long id) {
        return repository.findById(id);
    }

    public Citiesormunicipalities save(Citiesormunicipalities citiesormunicipalities) {
        return repository.save(citiesormunicipalities);
    }

    public Citiesormunicipalities create(Citiesormunicipalities citiesormunicipalities) {
        return repository.save(citiesormunicipalities);
    }

    public List<Citiesormunicipalities> list() {
        return repository.findAll();
    }
   public Optional<Citiesormunicipalities> update(Long id, Citiesormunicipalities citiesormunicipalities) {
        return repository.findById(id)
                .map(existing -> {
                    Citiesormunicipalities updated = new Citiesormunicipalities(
                            existing.getId(),
                            citiesormunicipalities.getName(),
                            citiesormunicipalities.getCode(),
                            citiesormunicipalities.getStateregId()
                    );
                    return repository.save(updated);
                });
    }

    public Optional<Citiesormunicipalities> delete(Long id) {
        return repository.findById(id)
                .map(citiesormunicipalities -> {
                    repository.deleteById(id);
                    return citiesormunicipalities;
                });
    }
}
