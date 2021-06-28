package com.mnt.app.mind_nerves_employee_crud.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mnt.app.mind_nerves_employee_crud.main.entity.Employee;
import com.mnt.app.mind_nerves_employee_crud.main.repository.IEmployeeRepositoy;
import com.mnt.app.mind_nerves_employee_crud.main.services.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeRepositoy employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		String mm = "deleted successfully";
		ObjectMapper obj = new ObjectMapper();
		try {
			String msg = obj.writeValueAsString(mm);
			return msg;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
