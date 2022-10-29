package com.api.book.restEmployee.Entity;

public class Employee {
	
	
	private int Id;
	
	private String Name;
	private int Age;
	private String Address;
	private String Department_name;
	private int Salary;
	
	public Employee(int Id, String Name, int Age, String Address, String Department_name, int Salary) {
	    this.Id=Id;
		this.Name = Name;
	    this.Age = Age;
	    this.Address = Address;
	    this.Department_name= Department_name;
	    this.Salary= Salary;
	  }

	
	public Employee() {

	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getDepartment_name() {
		return Department_name;
	}


	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", Department_name="
				+ Department_name + ", Salary=" + Salary + "]";
	}
	



	
	
	
	
	


}
