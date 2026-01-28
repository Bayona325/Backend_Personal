package com.educate.creationofdatabase.domain.model;

import java.time.LocalDate;

public class Employees {
    private Integer id;
    private String personId;
    private LocalDate dateBirth;
    private Integer epsId;
    private Integer arlId;
    private Integer pensionfundId;
    private Integer typeemployeeId;

    public Employees() {

    }

    public Employees(Integer id, String personId, LocalDate dateBirth, Integer epsId, Integer arlId, Integer pensionfundId, Integer typeemployeeId) {
        this.id = id;
        this.personId = personId;
        this.dateBirth = dateBirth;
        this.epsId = epsId;
        this.arlId = arlId;
        this.pensionfundId = pensionfundId;
        this.typeemployeeId = typeemployeeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getEpsId() {
        return epsId;
    }

    public void setEpsId(Integer epsId) {
        this.epsId = epsId;
    }

    public Integer getArlId() {
        return arlId;
    }

    public void setArlId(Integer arlId) {
        this.arlId = arlId;
    }

    public Integer getPensionfundId() {
        return pensionfundId;
    }

    public void setPensionfundId(Integer pensionfundId) {
        this.pensionfundId = pensionfundId;
    }

    public Integer getTypeemployeeId() {
        return typeemployeeId;
    }

    public void setTypeemployeeId(Integer typeemployeeId) {
        this.typeemployeeId = typeemployeeId;
    }
    
}
