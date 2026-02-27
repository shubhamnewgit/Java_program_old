package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConceptNavin {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("shubham", 101);
		empMap.put("chinmay", 102);
		empMap.put("prasad", 103);
		
		System.out.println(empMap.size()); //3
		System.out.println(empMap.get("shubham")); // 101
		
		empMap.put("prasad", 1008);
		System.out.println(empMap.get("prasad"));  // 1008
		
		
		HashMap<String, String> empData = new HashMap<String, String>();
		empData.put("shubham", "QA");
		empData.put("mangesh", "seniour QA");
		empData.put("pratik", "associate QA");
		empData.put("vipin", " system QA");
		empData.put(null,"sdet");
		empData.put("chinmay", null);
		empData.put("Ghate", null);
		
		System.out.println(empData);
		//empData.put(null, "school");
		//System.out.println(empData);
		
		empData.remove("Ghate");
		System.out.println(empData);
		
		empData.remove("chinmay", null);
		System.out.println(empData);
		
		boolean flag = empData.containsKey("shubham");
		System.out.println(flag);
		
		boolean flag1 = empData.containsValue("seniour QA");
		System.out.println(flag1);
		
		
		
		
		System.out.println("...............forloop................");
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		

	}

}
