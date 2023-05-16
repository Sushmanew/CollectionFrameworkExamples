package DemoMap_casestudy1;
import java.util.HashMap;

public class D_01_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> demo2  = new HashMap<String, String>();

    
    demo2.put("A", "Apple");
    demo2.put("B", "Ball");
    demo2.put("C", "Cat");
    demo2.put("D", "Dog");
    demo2.put("E","Elephant");
    demo2.put("F","Fish");
    demo2.put("G","Good");
    
    System.out.println(demo2);
    
    
    for (HashMap.Entry<String, String> set :demo2.entrySet()) {

    //System.out.println(set.getKey() + " = " + set.getValue());//it will print the o/p in line by line
    	
    	
    }
  }
}


