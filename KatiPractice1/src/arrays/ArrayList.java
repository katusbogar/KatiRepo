package arrays;

public class ArrayList {

	public static void main(String[] args) {
	
				// Hello Kati 
			      int[] myArrayList = {10, 20, 30, 40};
			      
			      System.out.println(myArrayList.length);
			      
			      //myArrayList[4] = 50;

			      // Print all the array elements
			      
			      for (int i = 0; i < myArrayList.length; i++) {
			         System.out.println(myArrayList[i] + " ");
			      }
			      
			     
			      
			      
			      // Summing all elements
			      
			     int total = 0;
			      for (int i = 0; i < myArrayList.length; i++) {
			         total += myArrayList[i];
			      }
			      System.out.println("Total is " + total);
			      
			     
			      // Finding the largest element
			      
			      int max = myArrayList[0];
			      for (int i = 1; i < myArrayList.length; i++) {
			         if (myArrayList[i] > max) max = myArrayList[i];
			      }
			      System.out.println("Max is " + max);
			  
			      
			      int[] myIntArray = new int[3];
			      //int[] myIntArray = {1,2,3};
			      //int[] myIntArray = new int[]{1,2,3};
			
			      
			      
			     

	}

}
