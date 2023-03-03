package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class ApiController 
{
	@Autowired
	StudentService a;
	
	@PostMapping("/addDetails")
	public String add(@RequestBody Student i)
	{
		a.save(i);
		return "Added";
	}
	@GetMapping("showDetails")
	public List<Student> fetch()
	{
		return a.get();
	}
	@GetMapping("showDetails/{id}")
	public Optional<Student> fetch(@PathVariable int id)
	{
		return a.get(id);
	}
	@PutMapping("/updateDetails")
	public String updateInfo(@RequestBody Student i1)
	{
		a.update(i1);
		return "Updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id)
	{
		a.delete(id);
		return "Deleted";
	}
}
