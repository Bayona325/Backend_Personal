package com.educate.creationofdatabase.infrastructure.adapter.out.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="countries")
public class CountriesEntity {
    @Id
    private String id;

    @NotEmpty
    @Size(min = 6, max = 6)
    @Column(length = 6, nullable = false, unique = true)
    private String isocode;
    
    @NotEmpty
    @Size(min=1, max=60)
    @Column(length = 60, nullable = false)
    private String name;

    public CountriesEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
