package com.educate.creationofdatabase.domain.model;

public class Companies {
    private String nui;
    private String name;
    private String cityId;
    private String contactName;
    private String emailcorp;
    private String emailContact;

    public Companies() {

    }

    public Companies(String nui, String name, String cityId, String contactName, String emailcorp, String emailContact) {
        this.nui = nui;
        this.name = name;
        this.cityId = cityId;
        this.contactName = contactName;
        this.emailcorp = emailcorp;
        this.emailContact = emailContact;
    }

    public String getNui() {
        return nui;
    }

    public void setNui(String nui) {
        this.nui = nui;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmailcorp() {
        return emailcorp;
    }

    public void setEmailcorp(String emailcorp) {
        this.emailcorp = emailcorp;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    
}
