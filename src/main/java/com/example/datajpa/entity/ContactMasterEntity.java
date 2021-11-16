package com.example.datajpa.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CONTACT_MASTER")
@Entity
public class ContactMasterEntity {
	@Id
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;

	public ContactMasterEntity(Integer contactId, String contactName, Long contactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	public ContactMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
