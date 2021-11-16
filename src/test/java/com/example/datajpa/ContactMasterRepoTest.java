package com.example.datajpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.ContactMasterEntity;
import com.example.datajpa.repository.ContactMasterRepo;
import com.example.datajpa.service.ContactMasterService;


@DataJpaTest
//@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ContactMasterRepoTest {
	
	@Autowired
	private ContactMasterRepo repo;
	
	
	
	@Test
	public void creteContactTest() {
		
		  ContactMasterEntity entity= new  ContactMasterEntity(101,"Ramesh",9988776655L); 
		  ContactMasterEntity savedContact = repo.save(entity);	 
		  Assertions.assertNotNull(savedContact);
		  
		 	}
	
	@Test
	public void getContactByIdTest() {
		int id=102;
		ContactMasterEntity entity2 = repo.getById(id);
		assertThat(entity2.getContactId()).isEqualTo(id);

	}
	
	@Test
	public void updateContactTest() {
		String contactName="John";
		ContactMasterEntity entity=new ContactMasterEntity(102, contactName, 9988776655L);
		entity.setContactId(102);
		
		repo.save(entity);
		
		ContactMasterEntity updatedContct=repo.findByContactName(contactName);
		
		assertThat(updatedContct.getContactName()).isEqualTo(contactName);

	}

}
