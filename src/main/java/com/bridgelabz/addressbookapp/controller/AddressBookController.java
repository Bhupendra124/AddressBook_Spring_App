package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.AddressBookService;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/book")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;
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
  List<AddressBookData> bookDataList =null;
    bookDataList = addressBookService.getAddressBookData();
    ResponseDTO respDTO=new ResponseDTO("Get Call Successfull",bookDataList);
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
        addressBookData=addressBookService.getAddressBookDataById(id);
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
    public ResponseEntity<ResponseDTO> createAddresBookData(
        @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Created AddressBook Data Succesfully ", addressBookData);
    return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
}

    /**
     *Put- localhost:8081/book/update/1
     * @param id
     * @param addressBookDTO
     * @return
     */

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddresBookData(@PathVariable("id") int id,
            @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData= addressBookService.updateAddressBookData(id,addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Update AddressBook Data Succesfully ", addressBookData);
        return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    /**
     * Delete-localhost:8081/book/delete/1
     * @param id
     * @return Delwte Call Sucess for id :1
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
        addressBookService.deleteAddressBookData(id);
        ResponseDTO respDTO=new ResponseDTO("Deleted Successfully  Deleted by id "+id);
    return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}
