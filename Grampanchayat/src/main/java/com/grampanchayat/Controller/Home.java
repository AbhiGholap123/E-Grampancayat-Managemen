package com.grampanchayat.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home1")
public class Home {
	
	@GetMapping("/welcome")
	public String Welcome()	
	{
		String text="this is private page";
		text+="this page is not allowed to access unauthorized users";
		return text;
	}
}
