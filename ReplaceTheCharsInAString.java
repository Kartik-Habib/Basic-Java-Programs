package practice;

public class ReplaceTheCharsInAString {

	public static void main(String[] args) {
       
		String s="6666KarnatakaIndia2236".toLowerCase();
		
		s.toLowerCase();
		
		String s1= s.replace('a', '@');
		String s2= s1.replace('i', '!');
		String s3= s2.replace('6', '9');
		
		System.out.println(s3);
		
		
		
	}

}
