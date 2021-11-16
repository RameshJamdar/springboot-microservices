package com.example.datajpa.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.datajpa.entity.ContactMasterEntity;
import com.example.datajpa.service.ContactMasterService;

@RestController
//@RequestMapping("/contactmaster")
public class ContactMasterController {
	
	@Autowired
	private ContactMasterService contactMasterService;
	
	@GetMapping("/{id}")
    public ContactMasterEntity getContactById(@PathVariable(required = true) int id) {
        return contactMasterService.getContactById(id);
    }
	
	@GetMapping()
    public List<ContactMasterEntity> getAllcontacts() {
        return contactMasterService.getAllcontacts();
    }

	
	@PostMapping("/newcontact")
	public void createContact(@RequestBody ContactMasterEntity entity) {
		contactMasterService.saveContact(entity);
	}
	
	@PutMapping("/{id}")
	public void updateContact(@PathVariable int id, @RequestBody ContactMasterEntity entity ) {
		ContactMasterEntity existingEntity = contactMasterService.getContactById(id);
		existingEntity.setContactId(entity.getContactId());
		existingEntity.setContactName(entity.getContactName());
		existingEntity.setContactNumber(entity.getContactNumber());
		
		 contactMasterService.updateContact(existingEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudentById(@PathVariable int id) {
		contactMasterService.deleteContactById(id);
	}

}
