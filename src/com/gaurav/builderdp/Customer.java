package com.gaurav.builderdp;

public class Customer {
    private String firstname; // mandatory
    private String lastname;  // mandatory
    private String address;
    private String sex;
    private Integer id;

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

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }

    public Customer(CustomerBuilder customerBuilder) {
        this.firstname = customerBuilder.getFirstname();
        this.lastname = customerBuilder.getLastname();
        this.id = customerBuilder.getId();
        this.address = customerBuilder.getAddress();
        this.sex = customerBuilder.getSex();
    }
}
