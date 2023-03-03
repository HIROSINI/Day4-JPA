package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	StudentRepo r;
	
	public Student save(Student f)
	{
		return r.save(f);
	}
	public List<Student> get()
	{
		return r.findAll();
	}
	public Optional<Student> get(int id)
	{
		return r.findById(id);
	}
	public Student update(Student f1)
	{
		return r.saveAndFlush(f1);
	}
	public String delete(int id)
	{
		r.deleteById(id);
		return "Deleted";
	}
}
