package com.ashutosh.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private int id;
	private String name;
	private String company;
	private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", age=" + age + "]";
	}
	
	
}
