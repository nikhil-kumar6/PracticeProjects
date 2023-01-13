package com.employeemanagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employeemanagement.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
