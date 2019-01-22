package com.capgemini.xyz.bean;

public class Customer {
	
	private long custId;
    private String custName;
    private String address;
   
    private String email;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    public class Loan{
    	
    	private long loanId;
    	private double loanAmount;
    	private long custId;
    	private int duration;
		public long getLoanId() {
			return loanId;
		}
		public void setLoanId(long loanId) {
			this.loanId = loanId;
		}
		public double getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public long getCustId() {
			return custId;
		}
		public void setCustId(long custId) {
			this.custId = custId;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
    	
    	
    	
    }
	

}
