package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class Api {
	@Autowired
	private UserService service;
	
	@PostMapping("/ip")
	public ResponseEntity<String> ip (HttpServletRequest request){
		// 요청 보낸 d클라이언트 ip 반환
		return ResponseEntity.ok(request.getRemoteAddr());
	}
	@GetMapping("/login")
		public String login(@RequestParam String id, @RequestParam String pw) {
		User list = null;
		try {
			 list= service.getUser();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list.getId();	
	}
	@GetMapping("/check")
	public String check(@RequestParam String id) {
		
	String checkid = null;
	try {
		 checkid= service.getId(id);
		 
	} catch (Exception e) {
		// TODO: handle exception
	}
	if(checkid == null) {
		return "false";	
	}else {
		return checkid;
	}
}
		
		
		
				
	
	
}
