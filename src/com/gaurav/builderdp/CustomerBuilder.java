package com.gaurav.builderdp;

public class CustomerBuilder {

    private String firstname; // mandatory
    private String lastname;  // mandatory
    private String address;
    private String sex;
    private Integer id;

    public CustomerBuilder(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public CustomerBuilder id(Integer id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder address(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder sex(String sex) {
        this.sex = sex;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public Integer getId() {
        return id;
    }
}
