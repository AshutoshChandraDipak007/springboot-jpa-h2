package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProjectDto;
import com.example.demo.entity.Project;
import com.example.demo.entity.Category;
import com.example.demo.repos.CategoryRepository;
import com.example.demo.repos.ProjectRepository;


@Service
public class CommonServiceForAll {
	
	@Autowired
	private ProjectRepository repository;	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	List<Project> listOfproject=new ArrayList<Project>();	
	List<Category> listOfcategory=new ArrayList<Category>();
	
	@PostConstruct
	private void saveDefaultProjectToDb(){
		Project project1=new Project("key1","buname1");
		Project project2=new Project("key2","buname2");	
		listOfproject.add(project1);
		listOfproject.add(project2);
		repository.saveAll(listOfproject);
	}
	
	@PostConstruct
	private void saveDefaultCategoryInDB(){
		Category category=new Category("categoryId1","buname1");
		Category category1=new Category("categoryId2","buname2");	
		Category category3=new Category("categoryId3","buname3");
		Category category4=new Category("categoryId4","buname4");	
		listOfcategory.add(category);
		listOfcategory.add(category1);
		listOfcategory.add(category3);
		listOfcategory.add(category4);
		categoryRepository.saveAll(listOfcategory);
	}
	
	public void savePerson(Project project){
		repository.save(project);
	}	
	
	public void saveCategory(Category category){
		categoryRepository.save(category);
	}	
	
	
	public List<Project> getProjects(){		
		return (List<Project>) repository.findAll();
	}
	
	public List<ProjectDto> getProjectsNU(){
		List<ProjectDto> listOfDto=new ArrayList<ProjectDto>();
		ProjectDto dto=new ProjectDto();
		List<String> listOffObj=categoryRepository.findAllProjectWithCategoryId();		
		listOffObj.forEach(item->{
			 String[] strlist=item.split(",",3);			 
				 dto.setProjectkey(strlist[0]);
				 dto.setBuName(strlist[1]);
				 dto.setCategoryId(strlist[2]);
				 listOfDto.add(dto);		
			System.out.println("item"+item.toString());
		});
		return listOfDto;
	}
	
}
