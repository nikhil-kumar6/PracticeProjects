package com.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.repo.EmployeeRepository;

@RestController

@RequestMapping("/Employee")
public class Mycontroller {

	@Autowired
	private EmployeeRepository employeerepository;
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		Employee save = this.employeerepository.save(employee);
		return ResponseEntity.ok(save);
		
	}
	
	@GetMapping("/details")
	public ResponseEntity<?> getEmployee(){
		return ResponseEntity.ok(this.employeerepository.findAll());
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestParam int id)
    {
        employeerepository.deleteById(id);
        return "Employee deleted successfully";
    }
	
	@PostMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee){
		Employee save = this.employeerepository.save(employee);
		return ResponseEntity.ok(save);
	}
}
