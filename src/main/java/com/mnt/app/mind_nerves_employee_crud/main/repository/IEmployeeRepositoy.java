package com.mnt.app.mind_nerves_employee_crud.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnt.app.mind_nerves_employee_crud.main.entity.Employee;

@Repository
public interface IEmployeeRepositoy extends JpaRepository<Employee, Integer> {

}
