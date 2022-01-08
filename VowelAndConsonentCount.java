package practice;


public class VowelAndConsonentCount {

	public static void main(String[] args) {
		

		String str= "kousHalya";
		str= str.toLowerCase();
		
		int vowelCount=0, consonentCount=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowelCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				{
				consonentCount++;
				
				} 
		
		}
		
		System.out.println("vowel Count " +vowelCount);
		System.out.println("consonent Count " +consonentCount);
		
		
		
	}
}
