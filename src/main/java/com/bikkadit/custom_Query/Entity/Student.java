package com.bikkadit.custom_Query.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_14")
public class Student {

	@Id
	@Column(name = "s_Id")
	private int sid;
	
	@Column(name = "s_First_Name")
	private String sfname;
	
	@Column(name = "s_Last_Name")
	private String slname;
	
	@Column(name = "s_Age")
	private int sage;
	
	@Column(name = "s_City")
	private String scity;
	
}
