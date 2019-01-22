package assignments;

import java.util.Scanner;

public class SixMain2 {
	
	public static void main(String[] args) {
		
			SixClass six=new SixClass();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Name");
			String name=scan.nextLine();
			System.out.println("Enter age");
			int age=scan.nextInt();
			six.Person(name, age);

}
}
