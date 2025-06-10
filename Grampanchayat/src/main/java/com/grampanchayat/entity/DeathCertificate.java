package com.grampanchayat.entity;


import java.time.LocalDate;

public class DeathCertificate {
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String deathPlace;
	private LocalDate deathdate;
	private LocalDate registerdate;
	private String fathername;
	private String fatherpermanentaddress;
	private String fathernationality;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDeathPlace() {
		return deathPlace;
	}
	public void setDeathPlace(String deathPlace) {
		this.deathPlace = deathPlace;
	}
	public LocalDate getDeathdate() {
		return deathdate;
	}
	public void setDeathdate(LocalDate deathdate) {
		this.deathdate = deathdate;
	}
	public LocalDate getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(LocalDate registerdate) {
		this.registerdate = registerdate;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getFatherpermanentaddress() {
		return fatherpermanentaddress;
	}
	public void setFatherpermanentaddress(String fatherpermanentaddress) {
		this.fatherpermanentaddress = fatherpermanentaddress;
	}
	public String getFathernationality() {
		return fathernationality;
	}
	public void setFathernationality(String fathernationality) {
		this.fathernationality = fathernationality;
	}
	
	public DeathCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DeathCertificate(String firstname, String middlename, String lastname, String deathPlace,
			LocalDate deathdate, LocalDate registerdate, String fathername, String fatherpermanentaddress,
			String fathernationality) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.deathPlace = deathPlace;
		this.deathdate = deathdate;
		this.registerdate = registerdate;
		this.fathername = fathername;
		this.fatherpermanentaddress = fatherpermanentaddress;
		this.fathernationality = fathernationality;
	}
	
	@Override
	public String toString() {
		return "DeathCertificate [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", deathPlace=" + deathPlace + ", deathdate=" + deathdate + ", registerdate=" + registerdate
				+ ", fathername=" + fathername + ", fatherpermanentaddress=" + fatherpermanentaddress
				+ ", fathernationality=" + fathernationality + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
