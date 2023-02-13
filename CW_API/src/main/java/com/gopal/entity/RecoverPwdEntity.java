package com.gopal.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class RecoverPwdEntity {
	@Id
	@GeneratedValue
	private Integer recPwdId;
	private String emailId;
	

}
