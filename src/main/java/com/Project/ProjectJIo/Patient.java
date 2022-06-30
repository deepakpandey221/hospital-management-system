package com.Project.ProjectJIo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Patient  implements Serializable{
private String name;
@Id
private int id_patient ;
private String medicine_recc;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id_patient;
}
public void setId(int id_patient) {
	this.id_patient = id_patient;
}
public String getMedicine_recc() {
	return medicine_recc;
}
public void setMedicine_recc(String medicine_recc) {
	this.medicine_recc = medicine_recc;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private String address;
}
