package com.educate.creationofdatabase.domain.model;

import java.time.LocalDate;

public class Employees {
    private Long id;
    private String personId;
    private LocalDate dateBirth;
    private Long epsId;
    private Long arlId;
    private Long pensionfundId;
    private Long typeemployeeId;

    public Employees() {

    }

    public Employees(Long id, String personId, LocalDate dateBirth, Long epsId, Long arlId, Long pensionfundId, Long typeemployeeId) {
        this.id = id;
        this.personId = personId;
        this.dateBirth = dateBirth;
        this.epsId = epsId;
        this.arlId = arlId;
        this.pensionfundId = pensionfundId;
        this.typeemployeeId = typeemployeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Long getEpsId() {
        return epsId;
    }

    public void setEpsId(Long epsId) {
        this.epsId = epsId;
    }

    public Long getArlId() {
        return arlId;
    }

    public void setArlId(Long arlId) {
        this.arlId = arlId;
    }

    public Long getPensionfundId() {
        return pensionfundId;
    }

    public void setPensionfundId(Long pensionfundId) {
        this.pensionfundId = pensionfundId;
    }

    public Long getTypeemployeeId() {
        return typeemployeeId;
    }

    public void setTypeemployeeId(Long typeemployeeId) {
        this.typeemployeeId = typeemployeeId;
    }
    
}
