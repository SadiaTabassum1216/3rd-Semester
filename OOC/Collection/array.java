package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class array {

	public static void main(String[] args) {
		int[] array= {5,4,7};
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			arraylist.add(array[i]);
		}
		System.out.println("Array before sort: ");
		for(int i: array) {
			System.out.println(i);
		}
		
		Arrays.sort(array);
		
		System.out.println("Array before sort: ");
		for(Integer i: array) {
			System.out.println(i);
		}
		
		
		System.out.println("Arraylist before sort: ");
		for(Integer i: arraylist) {
			System.out.println(i);
		}
		
		Collections.sort(arraylist);

		System.out.println("Arraylist after sort: ");
		for(Integer i: arraylist) {
			System.out.println(i);
		}
		
		Collections.reverse(arraylist);

		System.out.println("Arraylist after reverse: ");
		for(Integer i: arraylist) {
			System.out.println(i);
		}
		
		
		Collections.fill(arraylist, 9);

		System.out.println("Arraylist after fill: ");
		for(Integer i: arraylist) {
			System.out.println(i);
		}
		

	}

}
