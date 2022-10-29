package com.api.book.restEmployee.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.restEmployee.Entity.Employee;

@Component
public class EmployeeService {
	private static List<Employee> list= new ArrayList<>(); 

	static {
		list.add(new Employee(2,"Amit kumar",26,"Delhi","Development",40000));
		list.add(new Employee(3,"Rohit kumar",23,"Meerut","Service ",50000));
		list.add(new Employee(4,"Himanshu",36,"Bihar","Finance",20000));
		list.add(new Employee(5,"Rajat Sharma",31,"Delhi","Human Resource",15000));
		
	}
	
	//get all employee data
	public List<Employee> getAllEmpolyees()
	{
		return list;
		
	}
	
	
	//get employee data by Id
		
	public Employee getEmployeeById(int Id) {
		Employee emp=null;
		emp= list.stream().filter(e->e.getId()== Id).findFirst().get();
		return emp; 
		
	}
	
	
	// Add employee data
	
	public Employee addemployee(Employee employee) {
		
		list.add(employee);
		return employee;
		
	}

	// Delete Employee Data by Id

	public void deleteemployee(int empId) {
		list=list.stream().filter(emp-> emp.getId() != empId).collect(Collectors.toList());
	
		
		
	}


	public void updateemployee(Employee employee, int empId) {
		list=list.stream().map(emp ->{
			if(emp.getId()==empId) {
				emp.setName(employee.getName());
				emp.setAge(employee.getAge());
				emp.setAddress(employee.getAddress());
				emp.setDepartment_name(employee.getDepartment_name());
				emp.setSalary(employee.getSalary());
				
			}
		
			return emp;
		}).collect(Collectors.toList());
		
	}

}
