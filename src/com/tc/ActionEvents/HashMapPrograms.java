package com.tc.ActionEvents;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPrograms {

	HashMap<Integer, String> hash_map;

	
	public static void main(String[] args) {

		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  

		  hash_map.put(1, "Red");

		  hash_map.put(2, "Green");

		  hash_map.put(3, "Black");

		  hash_map.put(4, "White");

		  hash_map.put(5, "Blue");
		  
		  System.out.println(hash_map.size());

		  for(Entry<Integer, String> x:hash_map.entrySet()){  

		   System.out.println(x.getKey()+" "+x.getValue());  

		  }  
		  
		  HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();

		  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();

		  // populate hash maps

		  hash_map1.put(1, "Red");

		  hash_map1.put(2, "Green");

		  hash_map1.put(3, "Black");

		  System.out.println("\nValues in first map: " + hash_map1);

		  hash_map2.put(4, "White");

		  hash_map2.put(5, "Blue");

		  hash_map2.put(6, "Orange");

		  System.out.println("\nValues in second map: " + hash_map2);



		  // put all values in secondmap

		  hash_map2.putAll(hash_map1);

		  System.out.println("\nNow values in second map: " + hash_map2);

		 hash_map2.clear();
		 
		 System.out.println(hash_map2.isEmpty());
		 
		 hash_map1.containsValue("Red");  //Returns boolean value

		 hash_map1.containsKey(1);        //Returns boolean value



	}

}
