package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.exception.*; 
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class Person extends ServiceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceClass sC=new Person();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID :");
		sC.id=scan.nextInt();
		System.out.println("Enter Name :");
		sC.name=scan.nextLine();
		System.out.println("Enter Salary :");
		sC.sal=scan.nextInt();
		System.out.println("ID :"+sC.id);
		System.out.println("Name :"+sC.name);
		try {
			if(sC.sal<3000)
			{
				throw new EmployeeException("Cannot make Insurance");
			}
			else
			{
					System.out.println("Salary Is");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}

		
		sC.employeeInsurance(sal);
	}

}
