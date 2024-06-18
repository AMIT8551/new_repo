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

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfname=" + sfname + ", slname=" + slname + ", sage=" + sage + ", scity="
				+ scity + "]";
	}
	
	
	
}
