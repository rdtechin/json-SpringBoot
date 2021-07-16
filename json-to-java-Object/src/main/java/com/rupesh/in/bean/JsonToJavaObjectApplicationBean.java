package com.rupesh.in.bean;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JsonToJavaObjectApplicationBean {

	private String name;
	private Employee employee;
	private List<Management> management;
	
	public JsonToJavaObjectApplicationBean() {
		
	}
	
	public JsonToJavaObjectApplicationBean(String name, Employee employee, List<Management> management) {
		super();
		this.name = name;
		this.employee = employee;
		this.management = management;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<Management> getManagement() {
		return management;
	}
	public void setManagement(List<Management> management) {
		this.management = management;
	}
	
	@Override
	public String toString() {
		return "JsonToJavaObjectApplicationBean [name=" + name + ", employee=["+ employee.getDepartment()+","+employee.getDesignation()+","+employee.getSalary() +"]" + ", management name=" + 
				management.get(0).getName()
				+ "]";
	}

}
