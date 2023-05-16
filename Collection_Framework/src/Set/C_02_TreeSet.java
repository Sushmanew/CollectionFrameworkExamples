package Set;

import java.util.TreeSet;

public class C_02_TreeSet {

	public static void main(String[] args) {
		 TreeSet <String> names = new TreeSet <String>();
		   
		    names.add("Badhan");
			names.add("mahfuz");
			names.add("alam");
			names.add("arafat");
			names.add("kaosar");
			names.add("Rumon");
			System.out.println("Elements are: " + names);
			for(String values : names) {
			System.out.println("Elements are:" +values);
			}
		  }
		 
	}


