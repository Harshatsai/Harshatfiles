package com.cg.eis.service;
import com.cg.eis.bean.*;
public class ServiceClass extends Employee implements EmployeeService{
	@Override
	public void employeeInsurance(int sal) {
		// TODO Auto-generated method stub
		int salaray=sal;
		

		if(sal>5000 && sal<20000)
		{
			designation="System Associate";
			insuranceScheme="Scheme C";
			System.out.println("Designation :"+designation+"\nInsurance Scheme :"+insuranceScheme);
		}
		else if(sal>=20000 && sal<40000)
			{
				designation="Programmer";
				insuranceScheme="Scheme B";
				System.out.println("Designation :"+designation+"\nInsurance Scheme :"+insuranceScheme);
			}
		else if(sal>=40000)
		{
			designation="Manager";
			insuranceScheme="Scheme A";
			System.out.println("Designation :"+designation+"\nInsurance Scheme :"+insuranceScheme);
		}
		else
		{
			designation="Clerk";
			insuranceScheme="No Scheme";
			System.out.println("Designation :"+designation+"\nInsurance Scheme :"+insuranceScheme);
		}
	}
	public static void main(String[] args) {
		
	}

}
