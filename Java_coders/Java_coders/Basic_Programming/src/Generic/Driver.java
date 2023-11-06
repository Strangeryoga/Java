package Generic;

public class Driver extends Thread {
	public static void main(String[] args) throws InterruptedException {
		P5 ref=new P5();
		P6 ref1=new P6(ref);
		P7 ref2=new P7(ref);
		
		ref1.start();
		Thread.sleep(2000);
		ref2.start();
	}

}
