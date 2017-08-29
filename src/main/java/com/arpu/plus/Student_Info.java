package com.arpu.plus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Entity
@Table(name="STUDENT_IFNORMATION")
public class Student_Info {
	@Id
	@Column(name="ROLL_NUMBER")
	private int rollNo;
	@Column(name="NAME")
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	@Autowired
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	public void printData() {
		System.out.println("ID "+getRollNo()+" Name "+getName());
	}
	
}
