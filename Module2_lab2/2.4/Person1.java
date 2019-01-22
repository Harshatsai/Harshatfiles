

public class Person1 {
         String firstName;
          String lastName;
         char gender;
         long phoneNumber;
         
            
         
         long phoneNumber(long phoneNumber) {
			
			return phoneNumber;
		}


		public Person1() {
 			super();
 			
 		}
         
         
	public Person1(String firstname, String lastname, char gender) {
			super();
			this.firstName = firstname;
			this.lastName = lastname;
			this.gender = gender;
			System.out.println("Person");
			System.out.println("---------");
			System.out.println("firstname: " +firstName);
			System.out.println("lastname: " +lastName);
			System.out.println("gender: " +gender);
				
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



		public char getGender() {
			
			return gender;
		}



		public void setGender(char gender) {
			this.gender = gender;
		}



		}

