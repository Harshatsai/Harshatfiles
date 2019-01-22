package assignments;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {
	
	public void age(String dob)
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localdate=LocalDate.now();
		LocalDate enteredDate=LocalDate.parse(dob,formatter);
		Period period=Period.between(enteredDate, localdate);
		System.out.println("Age is :"+period.getYears());
	}
	
	public String fullName(String fName,String lName)
	{
		String fullName1=fName.concat(lName);
		return fullName1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CalculateAge calculateage=new CalculateAge();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter First Name:");
			String fName=scan.nextLine();
			System.out.println("Enter Last Name:");
			String lName=scan.nextLine();
			System.out.println("Enter Date of Birth:");
			String dob=scan.nextLine();
			System.out.println("Full Name :"+calculateage.fullName(fName,lName));
			calculateage.age(dob);
			
	}

}