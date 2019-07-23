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

import com.ashutosh.demo.Dao.StudentDao;
import com.ashutosh.demo.model.Student;
@RequestMapping("/Student")
@RestController
public class StudentController
{
	@Autowired
	StudentDao sdao;
	@GetMapping("/")
	@ResponseBody
	public List<Student> getAll()
	{
		return sdao.findAll();
	}	
	@GetMapping("/id/{id}")
	@ResponseBody
	public Optional<Student> getById(@PathVariable int id)
	{
		return sdao.findById(id);
	}
	@PostMapping("/add")
	@ResponseBody
	public Student addStudent(@RequestBody Student s)
	{
		return sdao.save(s);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String delete(@PathVariable int id)
	{
		 sdao.deleteById(id);
		 return "Deleted";
	}
	@PutMapping("/update")
	@ResponseBody
	public Student updateDetails(@RequestBody Student s)
	{
		sdao.deleteById(s.getId());
		return sdao.save(s);
	}
}
