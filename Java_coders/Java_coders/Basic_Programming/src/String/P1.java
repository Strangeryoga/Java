package String;

public class P1 {
	public static void main(String[] args) {
		String s="Java";
//		System.out.println(s.trim());
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
