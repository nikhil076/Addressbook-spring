package com.bridgelabz.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbook.entity.AddressBook;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
}
