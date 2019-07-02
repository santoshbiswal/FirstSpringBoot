package com.sb.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sb.config.AppConfig;
import com.sb.service.EmployeeService;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  {AppConfig.class} )
public class EmployeeTest {

	@Autowired
	private EmployeeService service;
	
	@Test
	public void getAllEmployeeTest() {
		assertNotNull(service.getAllEmployee());
		System.err.println(service.getAllEmployee());
		System.out.println("Byee...");
	}
}
