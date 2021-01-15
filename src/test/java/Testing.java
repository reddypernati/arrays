package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Testing {

	public static void main(String [] args) {
		
		int [] array = {10+20+30};
		int sum = 0;
		
		for(int i: array) 
		{
			sum = sum+i;
		}
		System.out.println("Sum of array elements is: " + sum);
		
/*//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		int[] a= new int[3];
		a[0]= 10;
		a[1]= 10;
		a[2]= 30;
		System.out.println("The total values are: " + (a[0] + a[2]));
		
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$		
		
		ArrayList list = new ArrayList();
		list.add("cars");
		list.add(12345);
		list.add("Pencils");
		list.add("Pens");
		
		System.out.println("The list values are :" + list);
		
		ArrayList list2 = new ArrayList();
		list2.add(200);
		list2.add(200);
		list2.add(200);
		list2.add(400);
		
	
		for(Object size:list2) {
		System.out.println("Total number is: " + size);
		}


//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
		
		ArrayList<String>array = new ArrayList<String>();
		array.add("temples");
		array.add("12345");
		array.add("Churches");
		array.add("Pencils");
		
		System.out.println(array);
		System.out.println(array.get(2));
	
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	
		ArrayList<Integer>array1 = new ArrayList<Integer>();
		array1.add(2345);
		array1.add(12345);
		array1.add(76890);
		array1.add(56789);
	
		System.out.println(array1);
		System.out.println(array1.get(2));*/
	}

}
//In Selenium we need only "add" and "get" methods only