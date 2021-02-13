

public class ForEachloop {
	
	public static void main (String args[]) {
		

		
		//declaring array
		int arr[] = {12,70,14,44};
		
		//traversing the array with for-each loop 
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		
		//declaring array
		int arr1[] = {12,13,14,44};
		int total=0;
		
		//traversing the array with for-each loop 
		for(int i:arr) {
			
			total = total + i;
		}
		System.out.println("Total: "+ total);
	}

}
//The syntax of Java for-each loop consists of data_type with the variable
//followed by a colon (:), then array or collection.