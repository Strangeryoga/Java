import java.util.Scanner;



public class New {
	public static void main(String[] args) {
		String s="Aka$h";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97 &&ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
			else {
				ch[i]=(char)(ch[i]+32);
			}
			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}
		
}
