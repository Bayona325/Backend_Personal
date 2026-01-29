package com.educate.creationofdatabase.infrastructure.adapter.out.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educate.creationofdatabase.infrastructure.adapter.out.entities.CompaniesEntity;

public interface JpaCompaniesRepository extends JpaRepository<CompaniesEntity,String> {

}
