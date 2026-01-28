package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Arl;

public interface ArlRepositoryPort {
    List<Arl> findAll();
    Optional<Arl> findById(Long id);
    Arl save(Arl arl);
    Optional<Arl> update(Long id, Arl Arl);
    Optional<Arl> deleteById(Long id);
}
