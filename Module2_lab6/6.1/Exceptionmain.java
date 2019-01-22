package assignments;

import java.util.Scanner;

public class Exceptionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1 six1=new Exception1();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter First Name");
			String fName=scan.nextLine();
			System.out.println("Enter Last Name");
			String lName=scan.nextLine();
			six1.PersonClass(fName, lName, 'M');
			
		
	}

}