


import java.util.Scanner;




public class PersonMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter phone number");
		   long phoneNo = sc.nextLong();
               Person2 person2=new Person2("Harshatsai","koppineni");
                Gen gender=Gen.M;
                System.out.println("Gender: "+gender);
               System.out.println("phoneNumber: " +person2.phoneNumber(phoneNo));
               
	}

}
