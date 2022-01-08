package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/*50=3
20=3
70=1
40=3
10=2
*/
public class CountTheFrequencyOfRepeatedNumersInArray {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,10,20,40,40,70,50,50,50,20,40};
         
	  Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	  
	  
	  for(int i: numbers)
	  {
		  if(map.containsKey(i))
		  {
			  map.put(i, map.get(i)+1);
		  }
		  else	  
			  {
				  map.put(i,1);
			  }
	  }
	  
	  for (Entry<Integer, Integer> i : map.entrySet()) 
	  {
	 	  System.out.println(i);
	  }
	  
	}

}
