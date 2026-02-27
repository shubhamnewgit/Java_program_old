package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConceptNavin {
// it will maintain insertion order
	public static void main(String[] args) {
		
		
		LinkedHashMap<String, String> empData = new LinkedHashMap<String, String>();
		empData.put("shubham", "QA");
		empData.put("mangesh", "seniour QA");
		empData.put("pratik", "associate QA");
		empData.put("vipin", " system QA");
		empData.put(null,"sdet");
		empData.put("chinmay", null);
		empData.put("Ghate", null);
		
		System.out.println(empData);
		empData.put(null, "school");
		System.out.println(empData);
		
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		


	}

}
