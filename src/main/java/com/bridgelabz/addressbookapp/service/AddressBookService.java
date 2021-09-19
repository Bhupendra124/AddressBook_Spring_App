package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList=new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO(1,"Bhupendra Wadekar" ,
                "Amla","Amla","MP","wadekar.bhupendra","460551","9893902047")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1, new AddressBookDTO(1,"Bhupendra Wadekar" ,
                "Amla","Amla","MP","wadekar.bhupendra","460551","9893902047"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
   AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int id) {

    }
}
