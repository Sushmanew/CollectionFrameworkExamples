package LinkedListDemo1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList<String> l_dup = new LinkedList<String>();
		l_dup.addAll(l);
		System.out.println(l_dup);
		
		l_dup.removeAll(l);
		System.out.println("After removing :" +l_dup);
		
		//Sort--- Collections.sort()
		System.out.println("Elements in the linked list:" +l);
		Collections.sort(l);
		System.out.println("Elements in the linked list after sorting:" +l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Elements in the linked list after sorting in reverse order:" +l);
		
		//shuffling -collections.shuffle()
		
		Collections.shuffle(l);
		System.out.println("Elements in the linked list after Shuffling:" +l);
	}
	
}



	


