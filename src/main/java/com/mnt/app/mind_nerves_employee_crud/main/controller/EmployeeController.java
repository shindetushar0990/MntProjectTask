package com.mnt.app.mind_nerves_employee_crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mnt.app.mind_nerves_employee_crud.main.entity.Employee;
import com.mnt.app.mind_nerves_employee_crud.main.services.IEmployeeService;

@RestController
@RequestMapping("/EmployeeResource")
public class EmployeeController {
	@Autowired
	IEmployeeService employeeService;

	// get all Employee--------

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public List<Employee> getAllEmplyee() {
		return employeeService.getAllEmployee();
	}

	// create employee---------

	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	// update employee---------

	@RequestMapping(value = "/employee", method = RequestMethod.PUT, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	// delete employee-----------

	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.DELETE, produces = { "application/json",
			"application/xml" })
	public String deleteEmployee(@PathVariable int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
}
