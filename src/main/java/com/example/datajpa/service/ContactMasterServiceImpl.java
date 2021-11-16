package com.example.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.datajpa.entity.ContactMasterEntity;
import com.example.datajpa.repository.ContactMasterRepo;



@Service
public class ContactMasterServiceImpl implements ContactMasterService {

	@Autowired(required = true)
	private ContactMasterRepo contactMasterRepo;

	@Override
	public List<ContactMasterEntity> getAllcontacts() {
		return contactMasterRepo.findAll();
	}

	@Override
	public ContactMasterEntity saveContact(ContactMasterEntity contact) {
		return contactMasterRepo.save(contact);

	}

	@Override
	public ContactMasterEntity getContactById(int id) {

		return contactMasterRepo.findById(id).get();
	}

	@Override
	public ContactMasterEntity updateContact(ContactMasterEntity contact) {
		return contactMasterRepo.save(contact);
	}

	@Override
	public void deleteStudentById(int id) {
		contactMasterRepo.deleteById(id);
	}

}
