package com.grampanchayat.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Data
@Entity
public class UserRegistration {

	@Id
	@NonNull
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long userId;
	private String aadharNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private Long mobileNumber;
	private String password;
//	private String confirmPassword;
	private String date;
	private String gender; 
	 

	@ManyToOne()
	@JoinColumn(name = "stateId")
	private State state;
	@ManyToOne()
	@JoinColumn(name = "districtId")
	private District district;
	@ManyToOne()
	@JoinColumn(name = "talukaId")
	private Taluka taluka;
	@ManyToOne()
	@JoinColumn(name = "villageId")
	private Village village;
	
//	
//	public Long getAadharNumber() {
//		return aadharNumber;
//	}
//	public void setAadharNumber(Long aadharNumber) {
//		this.aadharNumber = aadharNumber;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getMiddleName() {
//		return middleName;
//	}
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public Long getMobileNumber() {
//		return mobileNumber;
//	}
//	public void setMobileNumber(Long mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public State getState() {
//		return state;
//	}
//	public void setState(State state) {
//		this.state = state;
//	}
//	public District getDistrict() {
//		return district;
//	}
//	public void setDistrict(District district) {
//		this.district = district;
//	}
//	public Taluka getTaluka() {
//		return taluka;
//	}
//	public void setTaluka(Taluka taluka) {
//		this.taluka = taluka;
//	}
//	public Village getVillage() {
//		return village;
//	}
//	public void setVillage(Village village) {
//		this.village = village;
//	}
//	
//	public UserRegistration() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public UserRegistration(Long aadharNumber, String firstName, String middleName, String lastName, String email,
//			Long mobileNumber, String password, String confirmPassword, Date date, String gender, State state,
//			District district, Taluka taluka, Village village) {
//		super();
//		this.aadharNumber = aadharNumber;
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.email = email;
//		this.mobileNumber = mobileNumber;
//		this.password = password;
//		this.confirmPassword = confirmPassword;
//		this.date = date;
//		this.gender = gender;
//		this.state = state;
//		this.district = district;
//		this.taluka = taluka;
//		this.village = village;
//	}
//	@Override
//	public String toString() {
//		return "UserRegistration [aadharNumber=" + aadharNumber + ", firstName=" + firstName + ", middleName="
//				+ middleName + ", lastName=" + lastName + ", email=" + email + ", mobileNumber=" + mobileNumber
//				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", date=" + date + ", gender="
//				+ gender + ", state=" + state + ", district=" + district + ", taluka=" + taluka + ", village=" + village
//				+ "]";
//	}
	
	
	

}
