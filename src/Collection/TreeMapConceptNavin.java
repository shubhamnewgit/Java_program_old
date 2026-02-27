package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConceptNavin {

	public static void main(String[] args) {
		
		TreeMap<String, String> empData = new TreeMap<String, String>();
		
		empData.put("ashish", "dev");
		empData.put("shubham", "QA");
		empData.put("mangesh", "seniour QA");
		empData.put("bhushan", "mangr");
		empData.put("pratik", "associate QA");
		empData.put("Bhavna", "cloud");
		empData.put("vipin", " system QA");
		empData.put("Akshay", "engg");
		empData.put("1", "xyz");
		empData.put("$", "????");
		
		System.out.println(empData);
		
		for(Map.Entry<String, String> data: empData.entrySet()) {
			System.out.println(data.getKey() + " :" + data.getValue());
		}
		

	}

}
