package thread;

import java.util.Random;

public class PrintTask implements Runnable{

	private String string;
	private int sleeptime;
	private static Random generator=new Random();
	
	
	@Override
	public void run() {
		System.out.printf("%s is going to sleep for %d seconds.\n",string,sleeptime);
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s done sleeping.\n",string);
	}


	public PrintTask(String string) {
		this.string = string;
		sleeptime=generator.nextInt(5000);
	}

}
