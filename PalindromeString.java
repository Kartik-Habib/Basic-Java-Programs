package practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		System.out.println("Enter a String for Palindrome check");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String reverse="";
		int length= str.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse= reverse+str.charAt(i);
			
		}
		
		if(str.equals(reverse))
		{
			System.out.println(str +" is a Palindrome String");
		} 
		else
		{
			System.out.println(str +" is not a Palindrome String");
		}
		
	}
}
