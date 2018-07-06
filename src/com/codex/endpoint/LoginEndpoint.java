package com.codex.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codex.request.LoginRequest;

@RestController
public class LoginEndpoint {
	
	@GetMapping("/")
	@ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@PostMapping("/api/v1/login/user")
	@ResponseBody
	public boolean login(@RequestBody LoginRequest loginRequest){		
		System.out.println("USerNAme :++++++++ " + loginRequest.getEmailId());		
		System.out.println("Password :++++++++ " + loginRequest.getPassword());
		return true;
		
	}
	
}