package com.garguir.models;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String dni;
    private String name;
    private String lastName;
    private Address address;
    private String birthDate;

    public Person() {
        this.address = new Address();
    }

    public Person(int i){
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        this.name = "Pepe "+i;
        this.lastName = "Argento "+i;
        //this.dni =  (int)(Math.random()*100000);
        this.address= new Address(i);
        this.birthDate= formatter.format(new Date());
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.address = new Address();
    }

    public Person(String dni, String name, String lastName, Address address, String birthDate) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person { " +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", birthDate='" + birthDate + '\'' +
                " } ";
    }

}
