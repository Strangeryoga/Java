package Generic;

public class P6 extends Thread{
	P5 ref;
	P6(P5 ref){
		this.ref=ref;
		
	}
	public void run() {
		try {
			ref.write();
			
		} catch (Exception e) {
			System.out.println("Task 1");
		}

	}

}
