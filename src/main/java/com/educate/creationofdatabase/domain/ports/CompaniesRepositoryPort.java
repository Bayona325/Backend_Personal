package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.Companies;

public interface CompaniesRepositoryPort {
    List<Companies> findAll();
    Optional<Companies> findById(String nui);
    Companies save(Companies companies);
    Optional<Companies> update(String nui, Companies companies);
    Optional<Companies> deleteById(String nui);
}
