package com.papillon.dc.beans;

/**
 * Created by papillon on 5/14/2017.
 */
public class Person {

    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(){}

    public Person(String name,int id) {
        this.id = id;
        this.name = name;
    }

    public void speak(){
        System.out.println("I am a person");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }

    public void onCreate(){
        System.out.println("person created "+this);
    }

    public void onDestroy(){
        System.out.println("person destroyed "+this);
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
}
