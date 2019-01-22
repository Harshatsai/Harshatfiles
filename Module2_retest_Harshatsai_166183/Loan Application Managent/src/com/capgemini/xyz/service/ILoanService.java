package com.capgemini.xyz.service;

import javax.swing.LookAndFeel;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;
import com.capgemini.xyz.exception.LoanException;

public interface ILoanService {
	public long applyLoan(Loan loan) throws LoanException;
	public boolean validateCustomer(Customer customer) throws LoanException;
	public long insertCust(Customer cust) throws LoanException, Exception;
	public double calculateEMI(double amount,int duration) throws LoanException; 
	
	

}
