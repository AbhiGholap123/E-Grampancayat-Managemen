package com.grampanchayat.config;

 
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.authentication.AuthenticationProvider; 
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration; 
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import org.springframework.security.web.SecurityFilterChain; 
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.grampanchayat.filter.JwtAuthFilter;
import com.grampanchayat.services.UserInfoService; 

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {//implements WebMvcConfigurer{ 
	
//	@Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200") // Allow requests from this origin
//                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
//                .allowedHeaders("*"); // Allow all headers
//    }

	@Autowired
	private JwtAuthFilter authFilter; 

	// User Creation 
	@Bean
	public UserDetailsService userDetailsService() { 
		return new UserInfoService(); 
	} 

	// Configuring HttpSecurity 
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
//		return http.csrf().disable() 
//				.authorizeHttpRequests() 
//				.requestMatchers("/addNewUser","/normaluser/registerUser","/generateToken").permitAll() 
//				.and() 
//				.authorizeHttpRequests().requestMatchers("/auth/user/**").authenticated() 
//				.and() 
//				.authorizeHttpRequests().requestMatchers("/auth/admin/**").authenticated() 
//				.and() 
//				.sessionManagement() 
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
//				.and() 
//				.authenticationProvider(authenticationProvider()) 
//				.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class) 
//				.build(); 
//	} 
	
	@Bean
    public SecurityFilterChain publicSecurityFilterChain(HttpSecurity http) throws Exception {

        return http.csrf(AbstractHttpConfigurer::disable)
				.cors(Customizer.withDefaults())
				.authorizeHttpRequests(
						authorize->authorize 
						.requestMatchers("/auth/**","/normaluser/**")
						.permitAll())
				.authorizeHttpRequests(
						authorize->authorize.anyRequest().authenticated())
				.sessionManagement(
						session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authenticationProvider(authenticationProvider()) 
                .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class) 
                .build(); 
	}

	// Password Encoding 
	@Bean
	public PasswordEncoder passwordEncoder() { 
		return new BCryptPasswordEncoder(); 
	} 
	
//	@Bean
//	public CorsConfigurationSource apiConfigurationSource() {
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList( "http://localhost:4200"));
//		configuration.setAllowedMethods(Arrays.asList("GET","POST",""));
//		configuration.setAllowedHeaders(List.of("Authorization"));
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return source;
//	}

	@Bean
	public AuthenticationProvider authenticationProvider() { 
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider(); 
		authenticationProvider.setUserDetailsService(userDetailsService()); 
		authenticationProvider.setPasswordEncoder(passwordEncoder()); 
		return authenticationProvider; 
	} 

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception { 
		return config.getAuthenticationManager(); 
	} 


} 
