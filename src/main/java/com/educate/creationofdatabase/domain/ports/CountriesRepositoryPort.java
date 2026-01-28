package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Countries;

public interface CountriesRepositoryPort {
    List<Countries> findAll();
    Optional<Countries> findById(Long id);
    Countries save(Countries countries);
    Optional<Countries> update(Long id, Countries countries);
    Optional<Countries> deleteById(Long id);
}
