package com.Project.ProjectJIo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Nurse implements Serializable {
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatient_assigned() {
		return patient_assigned;
	}
	public void setPatient_assigned(String patient_assigned) {
		this.patient_assigned = patient_assigned;
	}
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	 private String patient_assigned;
	 @Id
	 private int id;

}
