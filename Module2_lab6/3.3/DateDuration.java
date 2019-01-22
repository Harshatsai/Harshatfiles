package assignments;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDuration {
	
		public void dateduration(String input)
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate enteredDate=LocalDate.parse(input,formatter);
			
			LocalDate localDate=LocalDate.now();
			Period period=Period.between(enteredDate, localDate);
			System.out.println("Duration Between in Days "+period.getDays());
			System.out.println("Duration Between in Months "+period.toTotalMonths());
			System.out.println("Duration Between in years "+period.getYears());
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter date in dd/MM/yyyy format:");
		String input=scanner.nextLine();
		DateDuration duration=new DateDuration();
		duration.dateduration(input);
		
	}

}