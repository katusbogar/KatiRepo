package arrays;

public class MyArray {

		    public static void main(String[] args) {
		        // declares an array of integers
		        int[] myArray;
		        //int[] myArray = new int[5];

		        // allocates memory for 5 integers
		        myArray = new int[8];
		           
		        // initialize first element
		        myArray[0] = 10;
		        // initialize second element
		        myArray[1] = 20;
		        // and so on
		        myArray[2] = 30;
		        myArray[3] = 40;
		        myArray[4] = 50;
		     

		        System.out.println("Element at index 0: "
		                           + myArray[0]);
		        System.out.println("Element at index 1: "
		                           + myArray[1]);
		        System.out.println("Element at index 2: "
		                           + myArray[2]);
		        System.out.println("Element at index 3: "
		                           + myArray[3]);
		        System.out.println("Element at index 4: "
		                           + myArray[4]);
		        
		     // Print all the array elements
		        for (int element: myArray) {
		           System.out.println(element);
		        }
		        
		        
		     
		  
		    }

	

}
