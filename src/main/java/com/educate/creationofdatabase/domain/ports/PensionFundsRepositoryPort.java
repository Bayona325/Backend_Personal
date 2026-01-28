package com.educate.creationofdatabase.domain.ports;

import java.util.List;
import java.util.Optional;

import com.educate.creationofdatabase.domain.model.PensionFunds;

public interface PensionFundsRepositoryPort {
    List<PensionFunds> findAll();
    Optional<PensionFunds> findById(Long id);
    PensionFunds save(PensionFunds pensionFunds);
    Optional<PensionFunds> update(Long id, PensionFunds pensionFunds);
    Optional<PensionFunds> deleteById(Long id);
}
