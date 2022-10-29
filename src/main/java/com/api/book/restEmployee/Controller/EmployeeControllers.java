package com.api.book.restEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.restEmployee.Entity.Employee;
import com.api.book.restEmployee.Service.EmployeeService;

@RestController
public class EmployeeControllers {
	//@RequestMapping(value="/employees", method=RequestMethod.GET)
	//@ResponseBody
	
	
	@Autowired
	private EmployeeService employeeservice;
	
	//All employee Data
	
	@GetMapping("/Employees")
	public List<Employee> getEmployee() {
	

	     return this.employeeservice.getAllEmpolyees();
		
	}
	
	
	//Employee data by id
	@GetMapping("/Employees/{Id}")

	public Employee getEmployeebyId(@PathVariable("Id")int Id ){
		

	     return this.employeeservice.getEmployeeById(Id);
		
	}
	
	
	//Post Employee data
	@PostMapping("/addemps")
	public Employee addemployee(@RequestBody Employee employee) {
		Employee emp=this.employeeservice.addemployee(employee);
		return emp;
		
	}
	
	
	//Delete Employee Data by Id
	@DeleteMapping("/employee/{empId}")
	public void deleteemployee(@PathVariable("empId") int empid){
		this.employeeservice.deleteemployee(empid);
	
		
	}
	
	
	// Update Employee Data
	
	@PutMapping("employee/{empId}")
	public Employee updateemployee(@RequestBody Employee employee,@PathVariable("empId")int empId ) {
		this.employeeservice.updateemployee(employee, empId);
		return employee;
		
	}
	
	

}
   