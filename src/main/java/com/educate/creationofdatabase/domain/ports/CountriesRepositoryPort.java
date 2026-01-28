package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Countries;

public interface CountriesRepositoryPort {
    List<Countries> findAll();
    Optional<Countries> findById(String id);
    Countries save(Countries countries);
    Optional<Countries> update(String id, Countries countries);
    Optional<Countries> deleteById(String id);
}
