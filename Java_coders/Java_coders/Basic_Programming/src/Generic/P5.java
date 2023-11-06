package Generic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P5 {
	String data="Killer Op";

	public synchronized void write() throws FileNotFoundException, InterruptedException {
		String path="C:\\Users\\tejas\\OneDrive\\Desktop\\1";
		FileOutputStream fs=new FileOutputStream(path);
		PrintWriter pw=new PrintWriter(fs);
		for(int i=0;i<data.length();i++) {
			pw.write(data.charAt(i));
			System.out.println("writing");
			Thread.sleep(2000);
		}
		pw.flush();
		
	}
	
	public synchronized void modify(String s) {
		data ="s";
		System.out.println("modifying");
		
	}
	public static void main(String[] args) {
		
		
	}

}
