package com.cg.eis.bean;

public class Employee {
	public int id;
	public String name;
	public static int sal;
	public String designation;
	public String insuranceScheme;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getSal() {
		return sal;
	}
	public static void setSal(int sal) {
		Employee.sal = sal;
	}
	
	
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

}
