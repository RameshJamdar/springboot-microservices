package com.example.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.entity.ContactMasterEntity;


@Repository
public interface ContactMasterRepo extends JpaRepository<ContactMasterEntity, Integer> {
	
	public ContactMasterEntity findByContactName(String name);

}
