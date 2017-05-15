package com.papillon.dc.beans;

/**
 * Created by papillon on 5/14/2017.
 */
public class Address {
    private String street;
    private String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init(){
        System.out.println("default init method");
    }

    public void destroy(){
        System.out.println("default destroy method");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
