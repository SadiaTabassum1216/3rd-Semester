package thread;

public class ArrayWriter implements Runnable{
	private SimpleArray shared;
	private int startvalue;
	

	@Override
	public void run() {
		for(int i=startvalue;i<startvalue+3;i++) {
			shared.add(i);
		}	
	}


	public ArrayWriter(SimpleArray shared, int startvalue) {
		this.shared = shared;
		this.startvalue = startvalue;
	}

}
