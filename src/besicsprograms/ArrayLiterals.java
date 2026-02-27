package besicsprograms;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//int array
		int i[] = {10,20,30,40,50};
		System.out.println("lenght of array is :" + i.length);
		System.out.println("lowest index of array is : Li = " + 0);
		System.out.println("Heighest index of array is : Hi =" + (i.length-1));
		System.out.println(Arrays.toString(i));
		
		//char array
		
		char ch[] = {'a','e','i','o','u'};
		for(int k=0; k<=ch.length-1; k++) {
			System.out.println(ch[k]);
		}
		
		
		//string array
		
		String product[] = {"lenovo","Hp","assus"};
		System.out.println(Arrays.toString(product));
		
		Object empData[] = {"shubham",30,12.33,"male",true};
		System.out.println("lenght of arrays is : " + empData.length);
		System.out.println(Arrays.toString(empData));
		

	}

}
