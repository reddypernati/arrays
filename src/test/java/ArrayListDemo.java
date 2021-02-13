

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Non-generic ArrayList
		ArrayList obj = new ArrayList();//dynamic array
		obj.add(23678);
		obj.add("Selenium WebDriver");
		obj.add(123.21);
		obj.add('M');
		System.out.println(obj);
		//it is returning based on the Insertion order [23678, Selenium WebDriver, 123.21, M]
		
		System.out.println(obj.get(2));// If I want to get specific value

	}

}
// In Selenium we need only "add" and "get"   methods only