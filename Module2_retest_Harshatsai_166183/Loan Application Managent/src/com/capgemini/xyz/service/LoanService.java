package com.capgemini.xyz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;
import com.capgemini.xyz.dao.LoanDao;
import com.capgemini.xyz.exception.LoanException;



public class LoanService implements ILoanService {

	@Override
	public long applyLoan(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validateCustomer(Customer customer) throws LoanException {
List<String> validationErrors=new ArrayList<String>();
		
		
		if(!(isValidCustomerName(customer.getCustName())))
		{
			validationErrors.add("\n customer name should be in alphabets and should have minimum 3 characerts:");
		}
		
		if(!(isValidCustomerAddress(customer.getAddress()))) {
			validationErrors.add("\ncustomer Address should have characters and  have minimum 3  characters");
		}


		if(!(isValidCustomerEmail(customer.getEmail()))) {
			validationErrors.add("\n customer email should have characters and  have minimum 3  characters");
		}
		if(!validationErrors.isEmpty()) {
			throw new LoanException();
		}
		return false;
		

}

	private boolean isValidCustomerName(String customerName) {
		// TODO Auto-generated method stub
		Pattern namePattern=Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(customerName);
		return nameMatcher.matches();
	}

	

	private boolean isValidCustomerAddress(String customerAddress) {
		// TODO Auto-generated method stub
		Pattern namePattern=Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(customerAddress);
		return nameMatcher.matches();
	}

	private boolean isValidCustomerEmail(String customerEmail) {
		// TODO Auto-generated method stub
		Pattern namePattern=Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(customerEmail);
		return nameMatcher.matches();
	}

	@Override
	public long insertCust(Customer cust) throws Exception {
		// TODO Auto-generated method stub
		LoanDao loandao=new LoanDao();
		long custSeq;
		custSeq=loandao.insertCust(cust);
		return custSeq;
	}

	@Override
	public double calculateEMI(double amount, int duration) {
		return duration;
		  
	//Object duration = (amount*duration*(1+amount)n/((1+duration)n-1));
		
	}

	

}
