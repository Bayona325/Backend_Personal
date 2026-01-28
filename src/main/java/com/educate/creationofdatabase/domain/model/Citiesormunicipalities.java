package com.educate.creationofdatabase.domain.model;

public class Citiesormunicipalities {
    private Long id;
    private String name;
    private String stateregId;
    private String code;

    public Citiesormunicipalities() {

    }

    public Citiesormunicipalities(Long id, String name, String stateregId, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.stateregId = stateregId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateregId() {
        return stateregId;
    }

    public void setStateregId(String stateregId) {
        this.stateregId = stateregId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
}
