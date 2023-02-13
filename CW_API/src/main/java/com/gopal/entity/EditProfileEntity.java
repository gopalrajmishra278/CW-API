package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EDIT_PROFILE")
@Data
public class EditProfileEntity {
	@Id
	@GeneratedValue
	private Integer epId;
	private String name;
	private String email;
	private String mobNum;
	
}
