package com.java4s.app.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.app.Domain.EmployeeDts;
import com.java4s.app.repository.SpringJava4sDAO;

@RestController
public class SpringJava4sController {

	@Autowired
	SpringJava4sDAO springDAO;
	
	@RequestMapping("/")
	public String welcome() {
		//return springDAO.getUserList();
		
		return "Welcome to Spring Boot Tutorials";
	}
	
	@RequestMapping("/hello")
	public List<EmployeeDts> myData() {
		return springDAO.getEmployeeLst();
	}
}
