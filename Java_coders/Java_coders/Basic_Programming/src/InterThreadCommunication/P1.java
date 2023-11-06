package InterThreadCommunication;

public class P1 {
	public synchronized void demo1(P2 ref) {
		System.out.println("Inside demo1 method");
		try {
			Thread.sleep(2000);
			wait(3000); //Interthread communication
			
		} catch (InterruptedException e) {
			System.out.println("Hi");
		}
		ref.baby1();
	}
	public synchronized void baby2() {
		System.out.println("Hi baby2");
	}

}
