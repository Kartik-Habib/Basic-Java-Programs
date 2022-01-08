package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RepeatedCharCount {

	public static void main(String[] args) {
		

	
	
	
	String str="abbcccdddd12233344445555".toLowerCase();
		char charArray[]= str.toCharArray();
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		
		for (char ch : charArray)
		{
			if(Character.isAlphabetic(ch))
			{
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
				else
				{
					map.put(ch, 1);
				}
			}
			
			if(Character.isDigit(ch))
			{
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
				else
				{
					map.put(ch, 1);
				}
			}
			
		}
		
		
		for (Entry<Character, Integer> i : map.entrySet())
		{
			System.out.println(i.getKey() +" Repeats " +i.getValue() +" times");
		}

	}

}
