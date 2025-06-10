package com.grampanchayat.services;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.core.userdetails.UsernameNotFoundException; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.UserInfo;
import com.grampanchayat.entity.UserRegistration;
import com.grampanchayat.repo.UserRegistrationRepo;

import java.util.Optional; 
  
@Service
public class UserInfoService implements UserDetailsService  {
	
	@Autowired
    private UserRegistrationRepo repository; 
  
    @Autowired
    private PasswordEncoder encoder; 
  
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
  
        Optional<UserRegistration> userDetail = repository.findByAadharNumber(username); 
  
        // Converting userDetail to UserDetails 
        return userDetail.map(UserInfoDetails::new) 
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username)); 
    } 
  
    public String addUser(UserRegistration userInfo) { 
        userInfo.setPassword(encoder.encode(userInfo.getPassword())); 
        repository.save(userInfo); 
        return "User Added Successfully"; 
    } 
  
  

}
