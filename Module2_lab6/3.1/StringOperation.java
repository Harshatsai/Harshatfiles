package assignments;

import java.util.Scanner;

public class StringOperation {

	public void stringoperation(String object, int ch)
	 {
		 
		String object1=object;
		int choice=ch;
		switch(choice)
		{
		case 1:
			  object1=object1.concat(object1);
		         System.out.println(object1);
		     	   break;
		case 2:
			    for(int i=0;i<object.length();i++)
			    {
			    	if(i%2==1)
			    	{
			    		object1=object1.replace(object1.charAt(i), '#');
			    		
			    	}
			    	
			    }
			     System.out.println(object1);
			     break;
			     
		case 3:
			    String duplicate=object1;
			     int count=0;
			    for(int i=0;i<duplicate.length();i++ )
			    {
			    	count=0;
			    for (int j =i+1; j <duplicate.length(); j++) 
			    {
			    	if(duplicate.charAt(i)==duplicate.charAt(j))
			    	{
			    		count++;
			    		break;
			    	}
					
				} 	
			    if(count==0)
			    {
			    	System.out.println(duplicate.charAt(i));
			    }
			    
			    }
			    break;
			    
		case 4:
			  String replace1=object1;
			  
			  for(int i=0;i<object.length();i++ )
			  {
				  if(i%2==1)
				  {
					  char R=replace1.charAt(i);
					  System.out.println(Character.toUpperCase(R));
				  }
				  else
				  {
					  System.out.println(replace1.charAt(i));
				  }
			  }
			    break;
		}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
            System.out.println("Enter the option ");
            System.out.println("1.Add text to itself ");
            System.out.println("2.Replace odd positions with # ");
            System.out.println("3.Remove Duplicate characters in the string");
            System.out.println("4.Change the Odd characters to uppercase");
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            System.out.println("Enter the text"); 
             String text=sc.nextLine();
             StringOperation stringoperation=new StringOperation();
             stringoperation.stringoperation(text, number);
             
	}

}
