package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService empService;
	
	@PostMapping("/addEmp")
	public Employee addEmp(@RequestBody Employee emp)
	{
		System.out.println(emp);
		return empService.addEmp(emp);
	}
	@GetMapping("/getAllEmp")
	public List<Employee> getAll()
	{
		List<Employee> allEmp=empService.getAllEmployee();
		System.out.println(allEmp);
		return allEmp;
	}
	@GetMapping("/getEmpById/{id}")
	public Employee getEmpById(@PathVariable("id") int id)
	{
		Employee emp=empService.getEmpById(id);
		System.out.println(emp);
		return emp;
	}
	@DeleteMapping("/deleteEmpById/{id}")
	public void deleteEmpById(@PathVariable("id") int id)
	{
	empService.deleteById(id);
	}
	@PutMapping("/updateEmp")
	public Employee update(@RequestBody Employee emp)
	{
	Employee upemp=empService.update(emp);
	return upemp;
	}

}
/*
 * {
    "empid":104,
    "name":"ajay",
    "designation":"SE",
    "salary":60000,
    "address":"Nagpur"

}
*/
