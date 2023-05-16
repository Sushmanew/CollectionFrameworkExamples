package Set;

import java.util.HashSet;

public class C_01_HashSet {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
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