package besicsprograms;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//int array
		int i[] = {10,20,30,40,50};
		for(int k:i) {
			System.out.println(k);
		}
		
		System.out.println("----------------------------------------");
		//string array
		String product[] = {"macBook","lenovo","HP","Assus"};
		for(String prod:product) {
			System.out.println(prod);
		}
		
		System.out.println("----------------------------------------");
		//double array
		double d[] = {1.1,2.1,54.5,33.65,11.11};
		for(double d1:d) {
			System.out.println(d1);
		}
		
		
		System.out.println("----------------------------------------");
		//object array
		Object empData[] = {"shubham",30,13.33,"male",true};
		for(Object obj:empData) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------------");
		
		//example
		int count =0;
		int a[] = {11,12,13,14,15};
		for(int val:a) {
			System.out.println(count + "----" + val);
			count++;
		}
		
		System.out.println("----------------------------------------");
		
		//eg
		int l[] = {1,2,3,4,5,6,7};
		int counter = l.length-1;
		for(int num:l) {
			System.out.println(l[counter]);
			counter--;
		}

		
	}

}
