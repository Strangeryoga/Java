package InterThreadCommunication;

public class Driver extends Thread {
	P1 ref1=new P1();
	P2 ref2=new P2();
	
	@Override
	public void run() {
		ref1.demo1(ref2);
	}
	public void test() {
		this.start();
		ref2.demo2(ref1);
	}

	public static void main(String[] args) {
		Driver d=new Driver();
		d.test();
		
	}

}
