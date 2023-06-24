package com.user.controller;

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

import com.user.bean.Subject;

import com.user.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@GetMapping("/users")
	public List<Subject> getAllSubjects() {
       return subjectService.getAllSubjects();
	}
	@GetMapping("/user/{id}")
	public Optional<Subject> getUser(@PathVariable int id ,@RequestBody Subject subject)
	{
		return subjectService.getSubject(id,subject);
	}
    
	
	@PostMapping("/user")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@PutMapping("/user/{id}")
	public void updateSubject(@PathVariable int id ,@RequestBody Subject subject)
	{
		subjectService.updateSubject(id,subject);
	}
    
	@DeleteMapping("/user/{id}")
	public void deleteSubject(@PathVariable int id)
	{
		subjectService.deleteSubject(id);
	}

}



















