package com.bridgelabz.addressbook.service;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

public interface IAddressBook {
    AddressBookDTO addAddressDetails(AddressBookDTO addressBookDTO);

    List<AddressBookDTO> getAddressDetails();

    AddressBookDTO getAddressDetailsByID(int id);

    AddressBookDTO updateAddressDetails(int id, AddressBookDTO addressBookDTO);

    AddressBookDTO deleteAddressDetails(int id);
}
