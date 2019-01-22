package com.capgemini.xyz.dao;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;
import com.capgemini.xyz.exception.LoanException;

public interface ILoanDao {
	public long applyLoan(Loan loan) throws LoanException;
	public long insertCust(Customer cust) throws LoanException, Exception;

}
