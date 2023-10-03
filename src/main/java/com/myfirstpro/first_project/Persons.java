package com.myfirstpro.first_project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persons {
	@Id
	private int ID;
	
	
	private String LastName;
	private String FirstName;
	private int Age;
	
private certificate certi;
 
	public certificate getCerti() {
	return certi;
}
public void setCerti(certificate certi) {
	this.certi = certi;
}
	public Persons(int iD, String lastName, String firstName, int age) {
		super();
		ID = iD;
		LastName = lastName;
		FirstName = firstName;
		Age = age;
	}
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ID+" "+this.LastName+" "+this.FirstName+" " +this.Age+this.certi;
	}
	

	
}
