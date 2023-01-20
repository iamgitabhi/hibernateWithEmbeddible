package com.hibembd.embedddible;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	String courseName;
	int fee;
	public Course(String courseName, int fee) {
		super();
		this.courseName = courseName;
		this.fee = fee;
	}
	public Course() {
		
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fee=" + fee + "]";
	}
}
