package com.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sb.dto.EmployeeDto;

public class EmployeeDao {

	private DataSource dataSource;

	public EmployeeDao(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public List<EmployeeDto> getAllEmployee() {

		List<EmployeeDto> empList=new ArrayList<>();
		String query = "select id,name,phone from employee";
		Connection connection;
		try {
			connection = dataSource.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			
			
			while (rs.next()) {
				
				
				empList.add(new EmployeeDto(rs.getInt("id"), rs.getString("name"), rs.getLong("phone")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empList;
	}
}
