package com.java4s.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java4s.app.Domain.EmployeeDts;
import com.java4s.app.Domain.Users;

@Repository
public class SpringJava4sDAO {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Users> getUserList(){
		
		List<Users> usrLst = new ArrayList<>();
		List<Map<String, Object>> mapLst = jdbctemplate.queryForList("select * from users");
		for (Map<String, Object> map : mapLst) {
			Users usr = new Users();
			usr.setUserName((String)map.get("user_name"));
			usr.setPassword((String)map.get("user_password"));
			usrLst.add(usr);
		}
		return usrLst;
		
	}

	public List<EmployeeDts> getEmployeeLst() {
		List<EmployeeDts> usrLst = new ArrayList<>();
		List<Map<String, Object>> mapLst = jdbctemplate.queryForList("select * from employee");
		for (Map<String, Object> map : mapLst) {
			EmployeeDts usr = new EmployeeDts();
			usr.setId((String)map.get("id"));
			usr.setName((String)map.get("name"));
			usrLst.add(usr);
		}
		return usrLst;
	}
}
