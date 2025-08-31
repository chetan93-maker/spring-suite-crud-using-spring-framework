package com.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Stud_ID;
	private String name;
	private int age;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_ID, String name, int age, String city) {
		super();
		Stud_ID = stud_ID;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getStud_ID() {
		return Stud_ID;
	}

	public void setStud_ID(int stud_ID) {
		Stud_ID = stud_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Stud_ID=" + Stud_ID + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
