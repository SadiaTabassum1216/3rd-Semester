package thread;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
	private int array[];
	private int writeIndex=0;
	private static Random generator=new Random();
	
	public SimpleArray(int size) {
		array=new int[size];
	}
	
	public synchronized void add(int value) {
		int position=writeIndex;
		
		try {
			Thread.sleep(generator.nextInt(500));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		array[position]=value;
		System.out.printf("%s wrote %d to element %d\n",Thread.currentThread().getName(),value,position);
		writeIndex++;
		System.out.printf("next write index: %d\n",writeIndex);
		
	}

	@Override
	public String toString() {
		return "SimpleArray [array=" + Arrays.toString(array) + "]";
	}
	
}
