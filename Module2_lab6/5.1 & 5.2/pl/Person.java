package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class Person extends ServiceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceClass sC=new Person();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee id,name,salary");
		sC.id=scan.nextInt();
		sC.name=scan.nextLine();
		sC.sal=scan.nextInt();
		System.out.println("ID :"+sC.id);
		
		System.out.println("Name :"+sC.name);
		System.out.println("Salary :"+sC.sal);
		sC.employeeInsurance(sal);
	}

}

