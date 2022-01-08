package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// Count The Frequency Of a each Word in a given string
public class CountTheFrequencyOfWords {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		String str=sc.nextLine();
		
	//	String str= "I am learning Java Java coding and I am going good good";
		
		String st[]= str.split(" ");
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		

		for (String s : st) 
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);	
			}
			else
			{
				map.put(s, 1);	
			}
		}
		
		
		for (Entry<String, Integer> string : map.entrySet()) {
			System.out.println(string);
		}
	}

}
