package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/book")
public class AddressBookController {
    /**
     * Get -localhost:8081/book/get
     * @return
     * {
     *     "message": "Get Call Successfull",
     *     "data": {
     *         "id": 1,
     *         "fullName": "Bhupendra",
     *         "address": "Amla",
     *         "city": "Amla",
     *         "state": "MP",
     *         "emailId": "wadekar.bhupendra6@gmail.com",
     *         "zip": "460551",
     *         "phoneNumber": "9893902047"
     *     }
     * }
     */
    @RequestMapping(value = {"" ,"/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
    AddressBookData addressBookData=null;
    addressBookData=new AddressBookData(1,new AddressBookDTO(1,"Bhupendra","Amla","Amla","MP","wadekar.bhupendra6@gmail.com","460551","9893902047"));
    ResponseDTO respDTO=new ResponseDTO("Get Call Successfull",addressBookData);
    return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
}

    /**
     * Get-localhost:8081/book/get/1
     * @param id
     * @return -Get call Success for id :1
     */
    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("Id") int id){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,new AddressBookDTO(1,"Bhupendra","Amla","Amla","MP","wadekar.bhupendra6@gmail.com","460551","9893902047"));
        ResponseDTO respDTO=new ResponseDTO("Get Call By Id Successfull",addressBookData);
      return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
}

    /**
     * POST-:localhost:8081/book/create
     *
     {
     "id":1,
     "fullName":"Bhupendra",
     "address":"Amla",
     "city":"Amla",
     "state":"MP",
     "emailId":"bsjsldknmk",
     "zip":"7897",
     "phoneNumber":"98709009"
     }
     * @param addressBookDTO
     * @returnCreate AddressBook Data for :AddressBookDTO{id=1, fullName='Bhupendra', address='Amla', city='Amla', state='MP', emailId='bsjsldknmk', zip='7897', phoneNumber='98709009'}
     */
    //{
    //    "message": "Created AddressBook Data Succesfully ",
    //    "data": null
    //}
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddresBookData(
        @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        ResponseDTO respDTO=new ResponseDTO("Created AddressBook Data Succesfully ", addressBookData);
    return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
}

    /**
     * Put-Delwte Call Sucess for id :1
     * @param addressBookDTO
     * @return
     */

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddresBookData(
            @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        ResponseDTO respDTO=new ResponseDTO("Update AddressBook Data Succesfully ", addressBookData);
        return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    /**
     * Delete-localhost:8081/book/delete/1
     * @param id
     * @return Delwte Call Sucess for id :1
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id){
    return  new ResponseEntity<String>("Delwte Call Sucess for id :"+id,HttpStatus.OK);
    }
}
