package lab4_2;

public class CurrentAccount extends Account{

	int overdraftLimit;
	
	public CurrentAccount(Person accHolder, double balance) {
		super(accHolder, balance);
	
	}
	
	
	@Override
	public void withdraw(double withdrawAmount){
		
		
			
	}
	
	
	public static void main(String args[]) {
		
		// Create person 
		Person smith = new Person("smith",22);
		Person kathy = new Person("kathy",22);
		
		// Create account for person
		SavingsAccount smithAcc = new SavingsAccount(smith, 2000);
		SavingsAccount kathyAcc = new SavingsAccount(kathy, 3000);
		
		// Deposit amount into smith
		smithAcc.deposit(2000);
		
		// Withdraw amount from kathy
		kathyAcc.withdraw(2000);
		
		System.out.println(smithAcc);
		System.out.println(kathyAcc);
	}

}
