package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
	private int queston_id;
	private String question;
	
	@OneToOne
	private Answare ans;
	
	public question(int queston_id, String question, Answare ans) {
		super();
		this.queston_id = queston_id;
		this.question = question;
		this.ans = ans;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQueston_id() {
		return queston_id;
	}
	public void setQueston_id(int queston_id) {
		this.queston_id = queston_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answare getAns() {
		return ans;
	}
	public void setAns(Answare ans) {
		this.ans = ans;
	}
	
	
	

}
