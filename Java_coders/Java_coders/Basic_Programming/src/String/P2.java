package String;

//CHeck whether the String is palindrom or not
public class P2 {

	public static void main(String[] args) {
		String s="mam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
	}
		if(s.equals(rev)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("no its not");
		}
}
}