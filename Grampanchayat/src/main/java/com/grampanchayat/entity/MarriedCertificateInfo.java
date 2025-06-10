package com.grampanchayat.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marriedtable")
public class MarriedCertificateInfo {
	//Bride Info
	@Id
	private int brideadharnumber;
	private String brideFirstname;
	private String brideMiddleName;
	private String brideLastName;
	private int brideAge;
//	private String brideMarritalStatus;
	private String brideAdress;
	
	//BrideRoom Info
	private long bridegroomadharnumber;
	private String brideRoomFistName;
	private String brideRoomMiddleName;
	private String brideRoomLastName;
	private int brideRoomAge;
//	private String brideRoomMarritalStatus;
	//default value  --false
	private boolean isCertificateGenerated;
	
	//common
	private Date Marriagedate;
	private String MarriagePlace;
	
	
	public long getBrideadharnumber() {
		return brideadharnumber;
	}
	public void setBrideadharnumber(int brideadharnumber) {
		this.brideadharnumber = brideadharnumber;
	}
	public long getBridegroomadharnumber() {
		return bridegroomadharnumber;
	}
	public void setBridegroomadharnumber(long bridegroomadharnumber) {
		this.bridegroomadharnumber = bridegroomadharnumber;
	}
	public String getBrideFirstname() {
		return brideFirstname;
	}
	public void setBrideFirstname(String brideFirstname) {
		this.brideFirstname = brideFirstname;
	}
	public String getBrideMiddleName() {
		return brideMiddleName;
	}
	public void setBrideMiddleName(String brideMiddleName) {
		this.brideMiddleName = brideMiddleName;
	}
	public String getBrideLastName() {
		return brideLastName;
	}
	public void setBrideLastName(String brideLastName) {
		this.brideLastName = brideLastName;
	}
	public int getBrideAge() {
		return brideAge;
	}
	public void setBrideAge(int brideAge) {
		this.brideAge = brideAge;
	}
//	public String getBrideMarritalStatus() {
//		return brideMarritalStatus;
//	}
//	public void setBrideMarritalStatus(String brideMarritalStatus) {
//		this.brideMarritalStatus = brideMarritalStatus;
//	}
	public String getBrideAdress() {
		return brideAdress;
	}
	public void setBrideAdress(String brideAdress) {
		this.brideAdress = brideAdress;
	}
	public String getBrideRoomFistName() {
		return brideRoomFistName;
	}
	public void setBrideRoomFistName(String brideRoomFistName) {
		this.brideRoomFistName = brideRoomFistName;
	}
	public String getBrideRoomMiddleName() {
		return brideRoomMiddleName;
	}
	public void setBrideRoomMiddleName(String brideRoomMiddleName) {
		this.brideRoomMiddleName = brideRoomMiddleName;
	}
	public String getBrideRoomLastName() {
		return brideRoomLastName;
	}
	public void setBrideRoomLastName(String brideRoomLastName) {
		this.brideRoomLastName = brideRoomLastName;
	}
	public int getBrideRoomAge() {
		return brideRoomAge;
	}
	public void setBrideRoomAge(int brideRoomAge) {
		this.brideRoomAge = brideRoomAge;
	}
//	public String getBrideRoomMarritalStatus() {
//		return brideRoomMarritalStatus;
//	}
//	public void setBrideRoomMarritalStatus(String brideRoomMarritalStatus) {
//		this.brideRoomMarritalStatus = brideRoomMarritalStatus;
//	}
	public Date getMarriagedate() {
		return Marriagedate;
	}
	public void setMarriagedate(Date marriagedate) {
		Marriagedate = marriagedate;
	}
	public String getMarriagePlace() {
		return MarriagePlace;
	}
	public void setMarriagePlace(String marriagePlace) {
		MarriagePlace = marriagePlace;
	}
	
	
	public MarriedCertificateInfo(int brideadharnumber,String brideFirstname, String brideMiddleName, String brideLastName, int brideAge,
			String brideMarritalStatus, String brideAdress,long bridegroomadharnumber,String brideRoomFistName, String brideRoomMiddleName,
			String brideRoomLastName, int brideRoomAge, String brideRoomMarritalStatus, Date marriagedate,
			String marriagePlace) {
		super();
		this.brideadharnumber=brideadharnumber;
		this.brideFirstname = brideFirstname;
		this.brideMiddleName = brideMiddleName;
		this.brideLastName = brideLastName;
		this.brideAge = brideAge;
//		this.brideMarritalStatus = brideMarritalStatus;
		this.brideAdress = brideAdress;
		this.bridegroomadharnumber=bridegroomadharnumber;
		this.brideRoomFistName = brideRoomFistName;
		this.brideRoomMiddleName = brideRoomMiddleName;
		this.brideRoomLastName = brideRoomLastName;
		this.brideRoomAge = brideRoomAge;
//		this.brideRoomMarritalStatus = brideRoomMarritalStatus;
		this.Marriagedate = marriagedate;
		this.MarriagePlace = marriagePlace;
	}
	
	public MarriedCertificateInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MarriedCertificateInfo [brideadharnumber="+brideadharnumber +",brideFirstname=" + brideFirstname + ", brideMiddleName=" + brideMiddleName
				+ ", brideLastName=" + brideLastName + ", brideAge=" + brideAge + ", brideMarritalStatus="
				 + ", brideAdress=" + brideAdress + ", bridegroomadharnumber="+bridegroomadharnumber+",brideRoomFistName=" + brideRoomFistName
				+ ", brideRoomMiddleName=" + brideRoomMiddleName + ", brideRoomLastName=" + brideRoomLastName
				+ ", brideRoomAge=" + brideRoomAge + ", brideRoomMarritalStatus=" +
			    ", Marriagedate=" + Marriagedate + ", MarriagePlace=" + MarriagePlace + "]";
	}
	
	
	
	
	
}
