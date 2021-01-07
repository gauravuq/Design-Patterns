package com.gaurav.builderdp;

public class Director {

    public static void main(String[] args) {
        Customer customer = new CustomerBuilder("Gaurav", "Sood")
                .id(12312)
                .address("USA")
                .build();
        System.out.println(customer);
    }
}
