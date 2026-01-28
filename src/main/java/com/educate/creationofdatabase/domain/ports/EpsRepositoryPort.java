package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Eps;

public interface EpsRepositoryPort {
    List<Eps> findAll();
    Optional<Eps> findById(Long id);
    Eps save(Eps Eps);
    Optional<Eps> update(Long id, Eps eps);
    Optional<Eps> deleteById(Long id);
}
