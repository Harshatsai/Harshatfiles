package assignments;


	public class Exception1 extends Exception {
		private String firstName;
		private String lastName;
		private char gender;
		void PersonClass(String firstName,String lastName,char gender)
		{
			try
			{
				this.firstName=firstName;
				this.lastName=lastName;
				this.gender=gender;
				if(firstName.isEmpty())
				{
					throw new Exception2("firstName cannot be Empty");
				}
				else if(lastName.isEmpty())
				{
					throw new Exception2("lastName cannot be Empty \n");
				}
				else
				{
					System.out.println("Person Details:");
					System.out.println("________________");
					System.out.println("FirstName :"+firstName);
					System.out.println("LastName :"+lastName);
					System.out.println("Gender :"+gender);
					System.out.println("Age:20");
					System.out.println("Weight:85.55");
				}
			}
			catch(Exception2 e)
			{
				e.printStackTrace();
			}
			
			
		}
		 
		public String getFirstName() {
			return firstName;
		}
		public  void setFirstName(String firstName) {
			this.firstName =firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}


		

	}

