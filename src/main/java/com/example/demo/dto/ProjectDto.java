package com.example.demo.dto;

public class ProjectDto {
private String projectkey;
private String categoryId;
private String buName;




public ProjectDto() {
	super();
	// TODO Auto-generated constructor stub
}
public ProjectDto(String projectkey, String categoryId, String buName) {
	super();
	this.projectkey = projectkey;
	this.categoryId = categoryId;
	this.buName = buName;
}
public String getProjectkey() {
	return projectkey;
}
public void setProjectkey(String projectkey) {
	this.projectkey = projectkey;
}
public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getBuName() {
	return buName;
}
public void setBuName(String buName) {
	this.buName = buName;
}


}
