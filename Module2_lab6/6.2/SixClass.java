package assignments;

public class SixClass extends AgeException {

	private String name;
	private int age;
	
	
	void Person(String name, int age) {
		try
		{
			
		
		this.name = name;
		this.age = age;
		if(age<15)
		{
			throw new AgeException("Age is below 15");
		}
	
		else
		{
		
			System.out.println("Name :"+name);
			
			System.out.println("Age:"+age);
			
		}
		}
	
		catch(AgeException e)
		{
			System.out.println(e);;
		}
	
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

	

	