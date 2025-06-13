package Collections.map;

import java.util.HashMap;

public class HashMapClass {
	
 public static void main(String[]args) {
	 Object[] arr = new Object [5];
	 HashMap<String,Object> hm = new HashMap<>();
	 hm.put("name", "Joice");
	 hm.put("name", "Joo");
	 hm.put("Age", 20);
	 hm.put(null, "23");
	 System.out.println(hm);
 }
}
