
public class Person {
         String firstName;
          String lastName;
         char gender;
         
         public Person() {
 			super();
 			
 		}
         
         
	public Person(String firstname, String lastname, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			System.out.println("Person");
			System.out.println("---------");
			System.out.println("firstname: " +firstname);
			System.out.println("lastname: " +lastname);
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
