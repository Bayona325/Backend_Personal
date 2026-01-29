package com.educate.creationofdatabase.infrastructure.adapter.out.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.educate.creationofdatabase.domain.model.Arl;
import com.educate.creationofdatabase.domain.ports.ArlRepositoryPort;
import com.educate.creationofdatabase.infrastructure.adapter.out.entities.ArlEntity;
import com.educate.creationofdatabase.infrastructure.adapter.out.repositories.JpaArlRepository;

@Repository
public class ArlRepositoryAdapter implements ArlRepositoryPort {
    private final JpaArlRepository jpaRepository;

    public ArlRepositoryAdapter(JpaArlRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
    @Override
    public List<Arl> findAll() {
        return jpaRepository.findAll()
            .stream()
            .map(this::toDomain)
            .collect(Collectors.toList());    
    }

    @Override
    public Optional<Arl> findById(Long id) {
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public Arl save(Arl arl) {
        ArlEntity entity = toEntity(arl);
        ArlEntity saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<Arl> update(Long id, Arl arl) {
        return jpaRepository.findById(id)
            .map(entity -> {
                entity.setName(arl.getName());
                return toDomain(jpaRepository.save(entity));
            });
    }

    @Override
    public Optional<Arl> deleteById(Long id) {
        return jpaRepository.findById(id)
            .map(entity -> {
                jpaRepository.delete(entity);
                return toDomain(entity);
            });
    }

    private Arl toDomain(ArlEntity entity) {
        Arl arl = new Arl(entity.getId(), entity.getName());
        return arl;
    }
    private ArlEntity toEntity(Arl Arl) {
        ArlEntity entity = new ArlEntity();
        entity.setId(Arl.getId());
        entity.setName(Arl.getName());
        return entity;
    }
}
