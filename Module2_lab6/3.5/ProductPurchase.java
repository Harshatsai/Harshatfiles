package assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProductPurchase {

			public void expiry(String name,int month,int years) {
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate localdate=LocalDate.parse(name,formatter);
				
				System.out.println("Purchased date:"+localdate);
				LocalDate local1=localdate.plusMonths(month);
				LocalDate local2=local1.plusYears(years);
				System.out.println("Expiry date"+local2);
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product purchase date:");
		String date=scan.nextLine();
		System.out.println("enter warranty duration in months and years");
		int month=scan.nextInt();
		int years=scan.nextInt();
		ProductPurchase productpurchase=new ProductPurchase();
		productpurchase .expiry(date, month, years);
	}

}
