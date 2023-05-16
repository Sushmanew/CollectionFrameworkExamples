package Set;

import java.util.LinkedHashSet;

public class C_03_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
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
