package com.mysql.test.demomysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySqlController {

	@Autowired
	MySqlTestService testService;
	@GetMapping("/emp")
	public List<Employee> getAllEmployees()
	{
		return testService.getAllEmployees();
	}
}
