package Generic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P4 {
	public void write() throws FileNotFoundException{
	String path = "C:\\Users\\tejas\\OneDrive\\Desktop\\output";
	String data= "Diwali";
	FileOutputStream fs=new FileOutputStream(path);
	PrintWriter pw=new PrintWriter(fs);
	for(int i=0;i<data.length();i++) {
		pw.write(data.charAt(i));
		System.out.println("writing");
		
	}
	pw.flush();
	
	}
	public static void main(String[] args) {
		P4 ref=new P4();
		try {
			ref.write();
			
		} catch (Exception e) {
			System.out.println("flush not working ");
		}
	}

}
