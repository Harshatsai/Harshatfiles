
public class Person2 {
      String firstName;
     String lastName;
    enum Gender
    {
    	M,F;
    }
    long phoneNumber;
    
       
    
    long phoneNumber(long phoneNumber) {
		
		return phoneNumber;
	}


	public Person2() {
		
		
	}
    
    
public Person2(String firstname, String lastname) {
		
		this.firstName = firstname;
		this.lastName = lastname;
		
		System.out.println("Person");
		System.out.println("---------");
		System.out.println("firstname: " +firstName);
		System.out.println("lastname: " +lastName);
		
			
	}





public String getFirstname() {
		return firstName;
	}



	public void setFirstname(String firstname) {
		this.firstName = firstName;
	}



	public String getLastname() {
		return lastName;
	}



	public void setLastname(String lastname) {
		this.lastName = lastname;
	}



	



	}

