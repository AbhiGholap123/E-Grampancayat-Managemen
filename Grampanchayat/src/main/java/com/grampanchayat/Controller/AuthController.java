package com.grampanchayat.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grampanchayat.entity.AuthRequest;
import com.grampanchayat.entity.DocumentInfo;
import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.entity.UserRegistration;
import com.grampanchayat.entity.UserRegistrationModel;
import com.grampanchayat.services.DocumentInfoService;
import com.grampanchayat.services.JwtService;
import com.grampanchayat.services.UserCertificateService;
import com.grampanchayat.services.UserInfoService;
import com.grampanchayat.services.UserRegisterdService;
//import com.jpa.test.entities.User;


@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {
	
	@Autowired
	private UserCertificateService residentCertificateService;
	
	@Autowired
    private UserInfoService service; 
  
    @Autowired
    private JwtService jwtService; 
    
  
    @Autowired
    private AuthenticationManager authenticationManager; 
    
	@Autowired
	private UserRegisterdService userRegisterdService;
	
	@Autowired
	private UserCertificateService userCertificateService;
	
	@Autowired
	private DocumentInfoService documentInfoService;
	
	
  
//    @PostMapping("/addNewUser") 
//    public String addNewUser(@RequestBody UserRegistration userInfo) { 
//        return service.addUser(userInfo); 
//    } 
  
//    @GetMapping("/admin/adminProfile") 
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')") 
//    public String adminProfile() { 
//        return "Welcome to Admin Profile"; 
//    } 
	
//	@PostMapping("/welcome")
//	public String getWelcomeString(@RequestBody Object  obj) {
//		return "Welcome navhi";
//	}
    
    
//	@PostMapping("/registerUser")
//	public UserRegistration registerUser(@RequestBody UserRegistrationModel model)
//	{
//		return userRegisterdService.singleuserregistered(model);
//	}
  
	//@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login") 
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getAadharNumber(), authRequest.getPassword())); 
        if (authentication.isAuthenticated()) { 
            String token = jwtService.generateToken(authRequest.getAadharNumber()); 
            
            return token;
        } else { 
            throw new UsernameNotFoundException("invalid user request ");
        } 
    } 
	
	
	@GetMapping("/registerusers")
	public ResponseEntity<List<UserRegistration>> getallusers()
	{
		List<UserRegistration> list=this.userRegisterdService.getallusers();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	
	
	
//	Store single user registration record
	@PostMapping("/info")
	public UserCertificateRegi forResidentCertiRegi(@RequestBody UserCertificateRegi object,@RequestHeader (name="Authorization") String authHeader)
	{
		String token =null;
		String aadharNumber =  null;
		if (authHeader != null && authHeader.startsWith("Bearer ")) { 
            token = authHeader.substring(7); 
            aadharNumber = jwtService.extractUsername(token); 
            object.setAadharNumber(aadharNumber);
        } 
		return this.residentCertificateService.residentCertiRegi(object);
	}
	

// Get All registerd user
	@GetMapping("/regiterUser")
	public List<UserCertificateRegi> getRegiUserDetail(@RequestHeader (name="Authorization") String authHeader)
	{
		String token =null;
		String aadharNumber =  null;
		if (authHeader != null && authHeader.startsWith("Bearer ")) { 
            token = authHeader.substring(7); 
            aadharNumber = jwtService.extractUsername(token); 
        } 
		return this.residentCertificateService.getRegisterUser(aadharNumber);
	}
	
	@GetMapping("/regiterUsersForAdmin")
	public List<UserCertificateRegi> getAllUsers()
	{
		
		return this.residentCertificateService.getAllUsers();
	}
	
// Get single registerd user
	@GetMapping("/userData/{id}")
	public UserCertificateRegi getSingleUserDetail(@PathVariable Long id)
	{
		return this.residentCertificateService.getSingleUserDetail(id);
	}
	
//	@PutMapping("/updateRecord/{id}")
//    public UserCertificateRegi updateUser(@PathVariable("id") Long id, @RequestParam("columnName") String document_status, @RequestParam("columnValue") String Approved) {
//        UserCertificateRegi userCertificateRegi=userCertificateService.updateUserColumn(id, document_status, Approved);
//        return userCertificateRegi;
//        
//        
//    }
	
//	@PutMapping("/recordupdate/{id}")
//	public ResponseEntity<DocumentInfo> updatbookById(@PathVariable("id") Long id, @RequestParam("columnName") String document_status, @RequestParam("columnValue") String Approved)
//	{
//		try {
//			DocumentInfo doc=this.documentInfoService.updateuser(id,document_status, Approved);
//			return ResponseEntity.of(Optional.of(doc));
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//	}
	
	
	@PutMapping("/updateDocStatus/{id}")
	public DocumentInfo updateDocStatus(@PathVariable Long id,@RequestBody DocumentInfo documentInfo)
	{
		
		DocumentInfo doc=this.documentInfoService.updateDocStatus(id,documentInfo);
		return doc;
	}

}
