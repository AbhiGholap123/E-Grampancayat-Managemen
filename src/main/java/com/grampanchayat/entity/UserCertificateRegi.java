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
	
	
	
	


	
	
	
	
}
