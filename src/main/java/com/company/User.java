package com.company;

public  class User implements java.io.Serializable {

    private int Id;
    private int companyId;
    private String firstName;
    private String lastName;
    private String role;

    public User(int Id, String firstName, String lastName, int companyId, String role){
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.role = role;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getFistName() {
        return firstName;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}