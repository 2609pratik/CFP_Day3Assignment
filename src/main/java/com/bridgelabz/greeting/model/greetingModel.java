package com.bridgelabz.greeting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class greetingModel {

	@Id
	@GeneratedValue
	private int id;
	private String greetingMsg ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGreetingMsg() {
		return greetingMsg;
	}
	public void setGreetingMsg(String greetingMsg) {
		this.greetingMsg = greetingMsg;
	}
	public greetingModel(int id, String greetingMsg) {
		super();
		this.id = id;
		this.greetingMsg = greetingMsg;
	}
	public greetingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "greetingModel [id=" + id + ", greetingMsg=" + greetingMsg + "]";
	}
	

	
}
