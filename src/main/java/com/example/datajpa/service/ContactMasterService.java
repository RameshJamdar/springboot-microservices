package com.example.datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.datajpa.entity.ContactMasterEntity;
import com.example.datajpa.exception.ContctFoundException;
import com.example.datajpa.repository.ContactMasterRepo;

@Component
public interface ContactMasterService {
	
	
List<ContactMasterEntity> getAllcontacts();
	
ContactMasterEntity saveContact(ContactMasterEntity contact);
	
ContactMasterEntity getContactById(int id);
	
ContactMasterEntity updateContact(ContactMasterEntity contact);
	
	void deleteStudentById(int id);
}
