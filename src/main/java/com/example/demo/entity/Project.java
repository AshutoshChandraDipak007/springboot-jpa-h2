package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Project {
	
	@Column(name = "Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "projectkey")	
	private String projectkey;
	
	@Column(name = "buName")
	private String buName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectkey() {
		return projectkey;
	}

	public void setProjectkey(String projectkey) {
		this.projectkey = projectkey;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectkey, String buName) {
		super();
		this.projectkey = projectkey;
		this.buName = buName;
	}
	
		
}
