package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
@Autowired
public EmployeeRepository empRepo;

public Employee addEmp(Employee emp)
{
Employee employee=(Employee) empRepo.save(emp);
return employee;
}

public List<Employee> getAllEmployee()
{
	List<Employee> allEmp=empRepo.findAll();
	return allEmp;
}
public Employee getEmpById(int empid)
{
	Employee  emp=empRepo.findById(empid).get();
	return emp;
}
public void deleteById(int empid)
{
	empRepo.deleteById(empid);
}
public Employee update(Employee emp)
{
	Employee upemp=empRepo.save(emp);
	return upemp;
}
}
