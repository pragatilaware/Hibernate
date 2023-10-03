package com.myfirstpro.first_project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crud_operation {
	@Id
	private int empyId;
	
	private String emplyName;
	private String emplyDepartment;
	public Crud_operation(int empyId, String emplyName, String emplyDepartment) {
		super();
		this.empyId = empyId;
		this.emplyName = emplyName;
		this.emplyDepartment = emplyDepartment;
	}
	public Crud_operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpyId() {
		return empyId;
	}
	public void setEmpyId(int empyId) {
		this.empyId = empyId;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public String getEmplyDepartment() {
		return emplyDepartment;
	}
	public void setEmplyDepartment(String emplyDepartment) {
		this.emplyDepartment = emplyDepartment;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empyId+":"+this.emplyName+": "+this.emplyDepartment;
	}
	

}
