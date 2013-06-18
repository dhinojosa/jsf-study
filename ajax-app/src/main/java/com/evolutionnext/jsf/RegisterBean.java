package com.evolutionnext.jsf;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isUSCitizen;
    private String ssn;
    private String country;
    private String visa;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isUSCitizen() {
        return isUSCitizen;
    }

    public void setUSCitizen(boolean USCitizen) {
        System.out.println("set us");
        isUSCitizen = USCitizen;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
}
