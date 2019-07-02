package com.sb.service;

import java.util.List;

import com.sb.dao.EmployeeDao;
import com.sb.dto.EmployeeDto;

public class EmployeeService {

	private EmployeeDao dao;
	
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public List<EmployeeDto> getAllEmployee(){
		System.out.println("We will get All Employee Data");
		return dao.getAllEmployee();
	}
	
}
