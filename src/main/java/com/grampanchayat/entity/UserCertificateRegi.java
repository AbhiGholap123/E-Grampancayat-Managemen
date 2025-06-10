package com.grampanchayat.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_certificate_regi")
public class UserCertificateRegi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="user_first_name")
	private String userFirstName;
	
	@Column(name="user_middle_name")
	private String userMiddleName;
	
	@Column(name="user_last_name")
	private String userLastName;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="documentId")
	private DocumentInfo documentInfo;
	
	private String aadharNumber;
	
//	Birth Certificate
	private String childName;
	private String birthDate;
	private String motherName;
	private String gender;
	private String birthPlace;
	private String fatherName;
	private String parentAddress;
	private String registrationDate;
	private String registrationNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public DocumentInfo getDocumentInfo() {
		return documentInfo;
	}
	public void setDocumentInfo(DocumentInfo documentInfo) {
		this.documentInfo = documentInfo;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getParentAddress() {
		return parentAddress;
	}
	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	
	
	
	


	
	
	
	
}
