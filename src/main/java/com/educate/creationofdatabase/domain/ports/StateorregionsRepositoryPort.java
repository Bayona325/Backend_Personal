package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Stateorregions;

public interface StateorregionsRepositoryPort {
    List<Stateorregions> findAll();
    Optional<Stateorregions> findById(String code);
    Stateorregions save(Stateorregions stateorregions);
    Optional<Stateorregions> update(String code, Stateorregions stateorregions);
    Optional<Stateorregions> deleteById(String code);
}
