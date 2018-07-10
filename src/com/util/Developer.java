package com.util;

import java.math.BigDecimal;

public class Developer {

	private String name;
	private BigDecimal salary;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Object contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
