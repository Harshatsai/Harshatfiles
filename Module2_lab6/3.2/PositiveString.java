package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {
	
			public void sort(String text)
			{
				char arr[]=text.toCharArray();
				Arrays.sort(arr);
				String text1=String.copyValueOf(arr);
				if(text.equals(text1))
				{
					System.out.println("Entered String is Positive");
				}
				else
				{
					System.out.println("Entered String is Negative");
				}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		PositiveString positivestring=new PositiveString();
		positivestring.sort(text);
	}

}