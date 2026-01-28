package com.educate.creationofdatabase.domain.model;

public class Countries {
    private String id;
    private String isocode;
    private String name;

    public Countries() {

    }

    public Countries(String id, String isocode, String name) {
        this.id = id;
        this.isocode = isocode;
        this.name = name;
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
