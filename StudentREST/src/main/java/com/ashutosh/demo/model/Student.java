package com.ashutosh.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int id;
	private String name;
	private String college;
	private String university;
	private int age;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", university=" + university + ", age="
				+ age + "]";
	}
	
}
