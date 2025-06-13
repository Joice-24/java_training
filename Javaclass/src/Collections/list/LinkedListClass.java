package Collections.list;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListClass {
	public static void main(String[]args) {
		int[] arr = new int [5];
		LinkedList<Integer> llist = new LinkedList();
		    llist.add(20);
	        llist.add(30);
	        llist.add(72);
	        llist.add(2, 69);    	       
	        llist.set(3, 24);      
	        llist.remove(1);
	        System.out.println(llist.reversed());
			System.out.println(llist.contains(100));
			System.out.println(llist.size());
			System.out.println(llist);
			
			Set<Integer> copy = new LinkedHashSet<>(llist);
			System.out.println();
	}
}
