package com.hibembd.embedddible;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sId;
	private String name;
	private Course cor;
	
	public Student() {
		
	}

	public Student(int sId, String name, Course cor) {
		super();
		this.sId = sId;
		this.name = name;
		this.cor = cor;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCor() {
		return cor;
	}

	public void setCor(Course cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", cor=" + cor + "]";
	}
	
}
