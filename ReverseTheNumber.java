package practice;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		
		int number=123456;
		
		int m= number; // original number is assigned to m for palindrome check  
		int rem, reverse=0;
		
		int productOfDigits=1;
		int sumOfDigits=0;
		
		while(number!=0)
		{
			rem= number%10;
			
			productOfDigits= productOfDigits * rem;  // Logic to find the product of digits 
			
			sumOfDigits= sumOfDigits+rem;   //  Logic to find the sum of digits 
			
			reverse= reverse*10+rem;  // Logic for reversing the number
			
			
			number=number/10;
			
		}
    System.out.println("Reversed : " +reverse);
    System.out.println("Product of Digits : " +productOfDigits);
    System.out.println("Sum  of Digits : " +sumOfDigits);
    
    if(m==reverse)   // palindrome check
    {
    	System.out.println("Palindrome number");
    }
    else
    {
    	System.out.println("Not a Palindrome number");
	}

}
	}
