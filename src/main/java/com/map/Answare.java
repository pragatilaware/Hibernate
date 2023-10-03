package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answare {
	@Id
	private int ans_id;
	private String answare;
	
private String answer;


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ans_id+" "+this.answer;
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answare(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}
	

}
