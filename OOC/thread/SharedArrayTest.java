package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedArrayTest {

	public static void main(String[] args) {
		SimpleArray shared=new SimpleArray(6);
		
		ArrayWriter writer1=new ArrayWriter(shared,5);
		ArrayWriter writer2=new ArrayWriter(shared,23);
		
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.execute(writer1);
		executor.execute(writer2);
		
		executor.shutdown();
	}

}
