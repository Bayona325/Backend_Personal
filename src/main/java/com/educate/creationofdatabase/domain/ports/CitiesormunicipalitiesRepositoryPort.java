package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Citiesormunicipalities;

public interface CitiesormunicipalitiesRepositoryPort {
    List<Citiesormunicipalities> findAll();
    Optional<Citiesormunicipalities> findById(Long id);
    Citiesormunicipalities save(Citiesormunicipalities citiesormunicipalities);
    Optional<Citiesormunicipalities> update(Long id, Citiesormunicipalities citiesormunicipalities);
    Optional<Citiesormunicipalities> deleteById(Long id);
}
