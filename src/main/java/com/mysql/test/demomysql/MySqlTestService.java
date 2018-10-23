package com.mysql.test.demomysql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySqlTestService {

	@Autowired
	MySqlTestRepository repo;
	
	
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> list = new ArrayList<>();
		 repo.findAll().forEach(list::add);
		 return list;
	}

}
