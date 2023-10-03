package com.myfirstpro.first_project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo_1 {
	@Id
	private int id;
	
	private String grade;
	private String name;
	public Demo_1(int id, String grade, String name) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
	}
	public Demo_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+":"+this.grade+":"+this.name;
	}
	

}
