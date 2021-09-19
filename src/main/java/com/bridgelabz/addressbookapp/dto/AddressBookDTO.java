package com.bridgelabz.addressbookapp.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ToString
@Data
@Getter
@Setter
@NoArgsConstructor
public class AddressBookDTO {
    public  int id;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "person Name is Invalid")
    @NotNull(message = "First name should not be Empty")
    public String fullName;

    @NotNull(message = "address should not be Empty")
    public String address;

    @NotNull(message = "City should not be Empty")
    public String city;

    @NotNull(message = "State should not be Empty")
    public String state;


    @Pattern(regexp = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$", message = "Email is invalid")
    @NotNull(message = "Email should not be Empty")
    @Column(unique=true)
    public  String emailId;

    @NotNull(message = "Zip should not be Empty")
    public  String zip;

    @NotNull(message = "Phone Number should not be Empty")
    public String phoneNumber;

//    public AddressBookDTO(int id, String fullName, String address, String city, String state, String emailId, String zip, String phoneNumber) {
//        this.id = id;
//        this.fullName = fullName;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.emailId = emailId;
//        this.zip = zip;
//        this.phoneNumber = phoneNumber;
//    }

//    @Override
//    public String toString() {
//        return "AddressBookDTO{" +
//                "id=" + id +
//                ", fullName='" + fullName + '\'' +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", emailId='" + emailId + '\'' +
//                ", zip='" + zip + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
}
