package generics;

public class Sorting {
	 public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.print(element+" ");
	      }
	      System.out.println();
	   }

	 public <T extends Comparable<T>> Sorting(T[] array)
		    {
		        int n = array.length;
		        for (int i = 0; i < n-1; i++)
		            for (int j = 0; j < n-i-1; j++)
		                if (array[j].compareTo(array[j+1])>0)
		                {
		                    T temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                }
		    }
	 
	   public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character

		      Integer[] intArray = {4, 1, 5, 3, 12,-4, 3, -423};
		      Double[] doubleArray= {4.5, 7.9, 1.6, 5.65745};
		      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		      
	        new Sorting(intArray);
	        new Sorting(doubleArray);
	        new Sorting(charArray);
	      
	        System.out.println("Bubble sort in integer array:");
	        printArray(intArray);   // pass an Integer array
	      

	        System.out.println("Bubble sort in double array:");
	        printArray(doubleArray);  	//pass an double array

	        System.out.println("Bubble sort in character array:");
	        printArray(charArray);  	//pass an character array
	   
	   }
	}

