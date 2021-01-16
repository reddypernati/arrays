

public class sum{
	
	  public static void main(String[]args){
		   
	      int[] array = {10, 20, 30, 40, 50, 10};
	      int sum = 0;
	      
	      //Advanced for loop
	      for( int i : array) {
	    	  
	          sum = sum+i;
	      }
	      
	      System.out.println("Sum of array elements is:"+sum);
	   }
	}

	/*//declaring array
		int arr1[] = {12,13,14,44};
		int total=0;
		
		//traversing the array with for-each loop 
		for(int i:arr) {
			
			total = total + i;
		}
		System.out.println("Total: "+ total);
		}
		}*/
		
		
		//The syntax of Java for-each loop consists of data_type with the variable
		//followed by a colon (:), then array or collection.