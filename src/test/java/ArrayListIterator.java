package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		

		ArrayList obj = new ArrayList();//dynamic array
		obj.add(23678);
		obj.add("Selenium WebDriver");
		obj.add("Selenium WebDriver");  //Java ArrayList class can contain duplicate elements.
		obj.add(123.21);
		obj.add('M');
		
		Iterator itr = obj.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			
			System.out.println("Values are " + value );
		}
		
	}

}
//In Selenium we need only "add" and "get" methods only