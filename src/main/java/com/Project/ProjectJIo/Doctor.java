package com.Project.ProjectJIo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctor implements Serializable {
	@Id
private int id;
private String name;
private String  designation;
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
