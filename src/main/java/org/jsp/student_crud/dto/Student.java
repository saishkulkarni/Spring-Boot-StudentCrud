package org.jsp.student_crud.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Student 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String standard;
private long mobile;
private double english;
private double kannada;
private double mathematics;
private double totalmarks;
private double percentage;
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
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public double getEnglish() {
	return english;
}
public void setEnglish(double english) {
	this.english = english;
}
public double getKannada() {
	return kannada;
}
public void setKannada(double kannada) {
	this.kannada = kannada;
}
public double getMathematics() {
	return mathematics;
}
public void setMathematics(double mathematics) {
	this.mathematics = mathematics;
}
public double getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(double totalmarks) {
	this.totalmarks = totalmarks;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}

}
