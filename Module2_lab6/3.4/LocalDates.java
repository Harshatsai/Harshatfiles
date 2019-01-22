package assignments;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDates{

	public void dateduration(String input,String input1)
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enteredDate=LocalDate.parse(input,formatter);
		
		LocalDate localDate=LocalDate.parse(input1,formatter);
		Period period=Period.between(enteredDate, localDate);
		System.out.println("Duration Between in Days "+period.getDays());
		System.out.println("Duration Between in Months "+period.toTotalMonths());
		System.out.println("Duration Between in years "+period.getYears());
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter first date in dd/MM/yyyy format:");
	String input=scanner.nextLine();
	System.out.println("enter second date in dd/MM/yyyy format:");
	String input1=scanner.nextLine();
	LocalDates localdates=new LocalDates();
	localdates.dateduration(input,input1);
	
}

}
