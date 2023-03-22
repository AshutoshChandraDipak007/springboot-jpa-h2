package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProjectDto;
import com.example.demo.entity.Project;
import com.example.demo.entity.Category;
import com.example.demo.services.CommonServiceForAll;

@RestController
public class TestController {
	
	@Autowired
	private CommonServiceForAll service;
	
	
	@GetMapping("/project")
	public List<Project> getTestApp() {		
		return service.getProjects();			
	}	
	
	@PostMapping("/project")
	public String createProject(@RequestBody Project project) {
		service.savePerson(project);
		return "Hello world ...";		
	}
	
	@GetMapping("/category")
	public List<Project> getCategory() {		
		return service.getProjects();			
	}	
	
	@PostMapping("/category")
	public String createCategory(@RequestBody Category category) {
		service.saveCategory(category);
		return "Hello world ...";		
	}
	
	@GetMapping("/all/projects")
	public List<ProjectDto> getAllProjectWithBu() {		
		return service.getProjectsNU();			
	}
}
