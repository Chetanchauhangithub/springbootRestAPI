package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	List<Employee> list;
	
	
	
	
	public EmployeeServiceImpl() {
		
		
		list = new ArrayList<>();
		list.add(new Employee(111,"Chetan",30000));
		list.add(new Employee(121,"Chauhan",40000));
		list.add(new Employee(113,"Abhi",20000));
	}




	@Override
	public List<Employee> getEmployee() {
		
		return list;
	}

}
