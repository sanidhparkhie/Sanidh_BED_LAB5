package com.gl.ems.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.ems.entity.Employee;
import com.gl.ems.repository.EmployeeRepository;
import com.gl.ems.service.EmployeeService;

@Service
public class EmployeeServicempl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServicempl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

}
