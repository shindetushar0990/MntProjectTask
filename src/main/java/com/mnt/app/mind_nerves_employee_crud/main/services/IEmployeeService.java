package com.mnt.app.mind_nerves_employee_crud.main.services;

import java.util.List;

import com.mnt.app.mind_nerves_employee_crud.main.entity.Employee;

public interface IEmployeeService {

	public List<Employee> getAllEmployee();

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public String deleteEmployee(int employeeId);
}
