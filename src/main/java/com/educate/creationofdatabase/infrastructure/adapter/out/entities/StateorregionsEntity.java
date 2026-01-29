package com.educate.creationofdatabase.infrastructure.adapter.out.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stateregions")
public class StateorregionsEntity {

    @Id
    @Column(name = "code", length = 6)
    private String code;

    @Column(name = "name", length = 60, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "countryid", nullable = false)
    private CountriesEntity country;

    @Column(name = "code1", length = 6, unique = true)
    private String code1;

    
}
