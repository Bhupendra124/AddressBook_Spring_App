package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
    public  int id;
    public String fullName;
    public String address;
    public String city;
    public String state;
    public  String emailId;
    public  String zip;
    public String phoneNumber;

    public AddressBookDTO(int id, String fullName, String address, String city, String state, String emailId, String zip, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
