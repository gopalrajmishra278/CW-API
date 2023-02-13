package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DAS-DIS")
@Data
public class DashboardDisplayEntity {
    @Id
    private Integer dasDisId;
	private Long numPlanAvail;
	private Long citizenApp;
	private Long citizenDenied;
	private Long familiesBenefited;
	
	
}
