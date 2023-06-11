package com.garguir.models;

import java.util.Objects;

public class Address {
    private String streetName;
    private String streetNumber;
    private String cityName;

    public Address() {
    }

    public Address(int i){
        this.streetName = "Street "+i;
        this.streetNumber = String.valueOf(i);
        this.cityName = "Mar del Plata";
    }

    public Address(String streetName, String streetNumber, String cityName) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetName, address.streetName) && Objects.equals(streetNumber, address.streetNumber) && Objects.equals(cityName, address.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, streetNumber, cityName);
    }

    @Override
    public String toString() {
        return "Address { " +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityName='" + cityName + '\'' +
                " } ";
    }
}
