package Collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	
	
	 public static void main(String[]args) {
		 Object[] arr = new Object [5];
		 LinkedHashMap<String,Object> hm = new LinkedHashMap<>();
		 hm.put("name", "Joice");
		 hm.put("name", "charu");
		 hm.put("Age", 20);
		 hm.put(null, "23");
		 System.out.println(hm);
		 
	 }
}
