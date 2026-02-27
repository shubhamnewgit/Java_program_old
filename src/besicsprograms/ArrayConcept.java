package besicsprograms;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		//int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		System.out.println("length of array is : " + i.length);
		System.out.println(Arrays.toString(i));
		
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
			
			if(i[j]==30) {
				System.out.println("hi");
			}
		}
		
		
		
		
		//short array
		short sh[] = new short[4];
		System.out.println("lenght of arrays is :" + sh.length);
		System.out.println("lowest index of array is : Li = " + 0);
		System.out.println("highest index of array is : Hi = " +(sh.length-1));
		
		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 20;
		System.out.println(Arrays.toString(sh));
		sh[1] = 40;
		System.out.println(Arrays.toString(sh));
		sh[3] = 30;
		System.out.println(Arrays.toString(sh));
		
		for(int k=0; k<=sh.length-1;k++) {
			System.out.println(sh[k]);
			
		}
		
		
		
		//char arrays
		char ch[] = new char[3]; 
		System.out.println("lenght of char array is :" + ch.length);
		System.out.println("lowest index of char arrays is : Li =  " + 0);
		System.out.println("Highest index of char array is : Hi = " + (ch.length-1) );
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		System.out.println(Arrays.toString(ch));
		
		
		// Object array - we can store any kind of data types
		// req - name,age,sal,gender,isperement
		
		Object empData[] = new Object[5];
		System.out.println("lenght of object array is : " + empData.length);
		System.out.println("Lowest index of object array is : li = " + 0);
		System.out.println("heighest index of object array is : Hi = " + (empData.length-1));
		
		empData[0] = "shubham";
		empData[1] = 28;
		empData[2] = 25.55;
		empData[3] = "male";
		empData[4] = true;
		
		System.out.println(Arrays.toString(empData));
		
		for(int e=0; e<=empData.length-1; e++) {
			System.out.println(empData[e]);
		}
		
		
		// string array
		
		String product[] = new String[3];
		product[0] = "macbook";
		product[1] = "macbook pro";
		product[2] = "lenevo";
		
		for(int x=0; x<=product.length-1; x++) {
			System.out.println(product[x]);
			if(product[x].equals("macbook pro")) {
				System.out.println(product[x] + " out of stock");
				break;
			}
		}
		
		
		
		
		
		

	}

}
