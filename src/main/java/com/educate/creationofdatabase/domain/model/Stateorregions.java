package com.educate.creationofdatabase.domain.model;

public class Stateorregions {
    private String code;
    private String name;
    private String countryId;
    private String code1;

    public Stateorregions() {

    }

    public Stateorregions(String code, String name, String countryId, String code1) {
        this.code = code;
        this.name = name;
        this.countryId = countryId;
        this.code1 = code1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    
}
