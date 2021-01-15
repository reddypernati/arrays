package arrays;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {

		//Non-generic ArrayList
		ArrayList obj = new ArrayList();//dynamic array
		obj.add(23678);
		obj.add("Selenium WebDriver");
		obj.add("Selenium WebDriver");  //Java ArrayList class can contain duplicate elements.
		obj.add(123.21);
		obj.add('M');
		
		int listsize = obj.size();
		for(int i=0; i<listsize; i++)
		{
			System.out.println("Values from ArrayList is: " + obj.get(i));
		}

	}

}
//set will allow unique values