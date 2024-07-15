package com.SpringRest.Rest3.Model;

public class Employee
{
    private Integer id;
    
    private String name;
    
    
    private String domain;
    
    private double salary;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String domain, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", domain=" + domain + ", salary=" + salary + "]";
	}
    
    
    
}
