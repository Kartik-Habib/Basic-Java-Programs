package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21 
		// 1 2 
		
	int n, next, fib=0, sum=1;
	System.out.println("Enter the range");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	
	for(int i=0; i<=n;i++)
	{
		if(i<=1)
		{
			next=i;
		}
		else
		{
			next= fib+sum;
			fib=sum;
			sum=next;
			
		}
		System.out.println(fib);
	}
		
		
	}

}
