package com.mnt.app.mind_nerves_employee_crud.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnt.app.mind_nerves_employee_crud.main.entity.Address;

public interface IAddressRepository extends JpaRepository<Address, Integer> {

}
