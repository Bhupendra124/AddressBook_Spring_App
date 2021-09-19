package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
    private int id;
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String emailId;
    private String zip;
    private String  phoneNumber;

    public AddressBookData(){}

    public AddressBookData(int id, AddressBookDTO addressBookDTO){
        this.id=id;
        this.fullName=addressBookDTO.fullName;
        this.address=addressBookDTO.address;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.emailId=addressBookDTO.emailId;
        this.zip=addressBookDTO.zip;
        this.phoneNumber=addressBookDTO.phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
