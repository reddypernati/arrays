package arrays;

import java.util.ArrayList;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		//Creating a list of elements  
		//Generic example of creating Java
		ArrayList<String> list = new ArrayList<String>();
		list.add("Selenium WebDriver");
		list.add("Testing");
		list.add("Cat");
		
		for(String s:list)
		{
			System.out.println("The values are: " + s);
		}
		
		//Creating a list of elements 
		//Generic example of creating Java
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12345);
		list1.add(67890);
		list1.add(19876);
		
		for(Integer i:list1)
		{
			System.out.println("The values are: " + i);
		}
	}

}
//In Generic Collection, we specify the type in angular braces.
//Now ArrayList is forced to have only specified type of objects in it.
//if you try to add another type of objects, it gives compile time error.
//https://www.javatpoint.com/for-each-loop
//Enhancef For Loop
//It makes the code more readable.
//It eliminates the possibility of programming errors.