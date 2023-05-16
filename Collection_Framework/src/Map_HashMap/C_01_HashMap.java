package Map_HashMap;

import java.util.HashMap;


public class C_01_HashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> AutomationTools = new HashMap<String, String>();
		
		AutomationTools.put("100","Selenium");
		AutomationTools.put("201","QTP");
		AutomationTools.put("106","Appium");
		AutomationTools.put("801", "Postman");
		AutomationTools.put("186","Jmeter");
		AutomationTools.put("123","Katalon");
		
		System.out.println(AutomationTools);
		
		//String value
		String ToolName = AutomationTools.get("100");
		
	System.out.println("Tools name is:" + ToolName);
		

	}

}


