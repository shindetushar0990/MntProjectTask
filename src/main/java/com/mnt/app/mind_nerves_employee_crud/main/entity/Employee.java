package com.mnt.app.mind_nerves_employee_crud.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String firstName;
	private String lastName;
	private String designation;
	private String employeeCode;
	private String mobileNo;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;
}
