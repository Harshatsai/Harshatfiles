package com.capgemini.xyz.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.exception.LoanException;
import com.capgemini.xyz.service.ILoanService;
import com.capgemini.xyz.service.LoanService;



public class ExecuterMain {
	
		static Scanner scan=new Scanner(System.in);
		static ILoanService loanService=null;
		static LoanService loanServiceImpl=null;
		public static void main(String[] args) {

			Customer customerBean=null;
			long custId=0;
			int option=0;
			while(true){
				
				System.out.println("XYZ Finance Company Welcomes You");
				System.out.println("--------------------------------");
				System.out.println("1.Register Customer");
				System.out.println("2.Exit");
				System.out.println("Select your choice");
				try {
					option=scan.nextInt();
					switch (option) {
					case 1:
						while(customerBean==null){
							customerBean=populateCustomer();
							
						}
						try {
							loanService=new LoanService();
							custId=loanService.insertCust(customerBean);
							System.out.println("customer details has been successfully added");
							System.out.println("customer id is"+custId );
						} catch (LoanException loanException) {
							System.out.println("error"+loanException.getMessage());
							
						}
						
						finally{
							custId=0;
							loanService=null;
							customerBean=null;
							
						}
						break;
					
					case 2:
						System.out.println("Your out of the page please try again");
						System.exit(0);
						break;
					default:
						break;
					}
		
				}
				 catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					       }
			}
		}
		
		private static Customer populateCustomer(){
			Customer customerBean=new Customer();
			System.out.println("Enter the Customer Name");
			customerBean.setCustName(scan.next());
			System.out.println("Enter Address");
			customerBean.setAddress(scan.next());
			System.out.println("Enter the email");
			
			try {
				customerBean.setEmail(scan.next());
			} catch (InputMismatchException ime) {
				scan.next();
				System.out.println("Please enter the  value for the email");
				// TODO: handle exception
			}
			loanService=new LoanService();
			try {
				loanService.validateCustomer(customerBean);
				return customerBean;
			} catch (LoanException loanException) {
				System.out.println("invalid data");
				System.out.println(loanException.getMessage()+"\n try again");
				System.exit(0);
				// TODO: handle exception
			}
			return customerBean;
			
		}
}


