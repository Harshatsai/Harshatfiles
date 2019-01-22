import java.util.Scanner;


public class PersonMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter phone number");
		   long phoneNo = sc.nextLong();
               Person1 person1=new Person1("Harshatsai","koppineni",'M');
               System.out.println("phoneNumber: " +person1.phoneNumber(phoneNo));
               
	}

}
