package com.ashutosh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashutosh.demo.dao.EmployeeDao;
import com.ashutosh.demo.model.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeController
{
	@Autowired
	EmployeeDao edao;
	@GetMapping("/")
	@ResponseBody
	public List<Employee> getAll()
	{
		return edao.findAll();
	}
	@GetMapping("/id/{id}")
	@ResponseBody
	public Optional<Employee> getById(@PathVariable int id)
	{
		return edao.findById(id);
	}
	@PostMapping("/add")
	@ResponseBody
	public Employee add(@RequestBody Employee e)
	{
		return edao.save(e);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String delete(@PathVariable int id)
	{
		 edao.deleteById(id);
		 return "Deleted";
	}
	@PutMapping("/update")
	@ResponseBody
	public Employee update(@RequestBody Employee e)
	{
		edao.deleteById(e.getId());
		return edao.save(e);
	}
	
}
