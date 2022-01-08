package practice;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args)
	{
		System.out.println("Enter a String to find its Substrings");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		System.out.println("Substrings are ");
		
		for (int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}

	}

}
