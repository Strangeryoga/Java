package InterThreadCommunication;

public class P2 {
	public synchronized void demo2(P1 ref) {
		System.out.println("Inside demo2 method");
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			System.out.println("Bye");
			
		}
		ref.baby2();
	}
	public synchronized void baby1() {
		System.out.println("Hi baby 1");
	}

}
