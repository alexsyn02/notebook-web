package model.entity;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class Address {
    private String index;
    private String city;
    private String street;
    private String house;
    private String apartment;

    private String fullAddress;

    public Address(String index, String city, String street, String house, String apartment, String fullAddress) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
        this.fullAddress = fullAddress;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
