package lab4_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder; 
	private static AtomicInteger ID_GENERATOR;
	
	public static long idGenerator() {
		
		ID_GENERATOR = new AtomicInteger(1000);
		return ID_GENERATOR.longValue();	
	}
	
	
	public Account(Person accHolder, double balance) {
		this.accHolder = accHolder;
		this.accNum = idGenerator();
		this.balance = balance;
	}
	
	public String toString() {
		return "Account num : " + accNum + " Balance : " + balance + " Account holder" + accHolder.toString();
	}
	
	public void deposit(double depositAmount) {
		
		this.balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount){
		
		if (this.balance > 500) {
			this.balance -= withdrawAmount;
		}
		
		else {
			System.out.println("Nil Balance");
		}
		
	}
	
	
	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}
