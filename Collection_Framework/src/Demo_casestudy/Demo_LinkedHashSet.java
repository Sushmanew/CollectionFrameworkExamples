package Demo_casestudy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> demo1 = new LinkedHashSet<String>();
		demo1.add("Apple");
	    demo1.add("Redmi");
	    demo1.add("Android");
	    demo1.add("Realme");
	    demo1.add("Samsung");
	    demo1.add("Wipro");
	    demo1.add("MF");
	    demo1.add("OT");
	    
	    
	    String[] str = {"apple","Redmi","Android","Realme","Samsung","wipro","MF","OT"};
	    System.out.println("The size of " + "the array is " + str.length);
	    
	    System.out.println("HashSet: " + demo1);
	    Iterator value = demo1.iterator();
	    System.out.println("The iterator values are: ");
	    while (value.hasNext()) {
	        System.out.println(value.next());
	        
	    }
	  }

	}


