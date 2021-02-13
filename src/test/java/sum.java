package arrays;

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