package Generic;

public class P7 extends Thread {
	P5 ref;
	P7(P5 ref){
		this.ref=ref;
	}
	
	@Override
	public void run() {
		ref.modify("Mango");
	}
	

}
