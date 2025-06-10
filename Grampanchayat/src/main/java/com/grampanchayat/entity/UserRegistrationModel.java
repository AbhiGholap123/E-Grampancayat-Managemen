package com.grampanchayat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRegistrationModel {
	
	private String firstName;
    private String middleName;
    private String lastName;
    private String aadharNumber;
    private String email;
    private long mobileNumber;
    private String password;
    private String gender;
    private String stateName;
    private String districtName;
    private String talukaName;
    private String villageName;
    
    
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
//	public long getAadharNumber() {
//		return aadharNumber;
//	}
//	public void setAadharNumber(long aadharNumber) {
//		this.aadharNumber = aadharNumber;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public long getMobileNumber() {
//		return mobileNumber;
//	}
//	public void setMobileNumber(long mobileNumber) {
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
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getStateName() {
//		return stateName;
//	}
//	public void setStateName(String stateName) {
//		this.stateName = stateName;
//	}
//	public String getDistrictName() {
//		return districtName;
//	}
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//	public String getTalukaName() {
//		return talukaName;
//	}
//	public void setTalukaName(String talukaName) {
//		this.talukaName = talukaName;
//	}
//	public String getVillageName() {
//		return villageName;
//	}
//	public void setVillageName(String villageName) {
//		this.villageName = villageName;
//	}
//	public UserRegistrationModel() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public UserRegistrationModel(String firstName, String middleName, String lastName, long aadharNumber, String email,
//			long mobileNumber, String password, String confirmPassword, String gender, String stateName,
//			String districtName, String talukaName, String villageName) {
//		super();
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.aadharNumber = aadharNumber;
//		this.email = email;
//		this.mobileNumber = mobileNumber;
//		this.password = password;
//		this.confirmPassword = confirmPassword;
//		this.gender = gender;
//		this.stateName = stateName;
//		this.districtName = districtName;
//		this.talukaName = talukaName;
//		this.villageName = villageName;
//	}
//	@Override
//	public String toString() {
//		return "model [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
//				+ ", aadharNumber=" + aadharNumber + ", email=" + email + ", mobileNumber=" + mobileNumber
//				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", gender=" + gender
//				+ ", stateName=" + stateName + ", districtName=" + districtName + ", talukaName=" + talukaName
//				+ ", villageName=" + villageName + "]";
//	}
//    
//    
//    
//    
}
