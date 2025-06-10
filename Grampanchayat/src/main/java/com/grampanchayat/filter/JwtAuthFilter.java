package com.grampanchayat.filter;


import jakarta.servlet.FilterChain; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken; 
import org.springframework.security.core.context.SecurityContextHolder; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.grampanchayat.services.JwtService;
import com.grampanchayat.services.UserInfoService;

import io.jsonwebtoken.io.IOException; 

@Component
public class JwtAuthFilter extends OncePerRequestFilter {
	
	@Autowired
    private JwtService jwtService; 
  
    @Autowired
    private UserInfoService userDetailsService; 
  
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException { 
        String authHeader = request.getHeader("Authorization"); 
        String token = null; 
        String aadharNumber = null; 
        if (authHeader != null && authHeader.startsWith("Bearer ")) { 
            token = authHeader.substring(7); 
            aadharNumber = jwtService.extractUsername(token); 
        } 
  
        if (aadharNumber != null && SecurityContextHolder.getContext().getAuthentication() == null) { 
            UserDetails userDetails = userDetailsService.loadUserByUsername(aadharNumber); 
            if (jwtService.validateToken(token, userDetails)) { 
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails.getUsername(),null, null); 
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request)); 
                SecurityContextHolder.getContext().setAuthentication(authToken); 
            } 
        }
        try {
			filterChain.doFilter(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		
    
}
}
    
