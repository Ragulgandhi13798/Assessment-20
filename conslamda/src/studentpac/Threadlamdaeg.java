package studentpac;

public class Threadlamdaeg {

	public static void main(String[] args) {
		
		Runnable r = ()-> {
			System.out.println("runnable class");
		};
		
		Thread t = new Thread(r);
		t.start();
		System.out.println("thread");
	}

}
