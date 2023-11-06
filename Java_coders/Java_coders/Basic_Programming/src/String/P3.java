package String;

//Find the vowels in the string
public class P3 {
	public static void main(String[] args) {
		String s="rashmi";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a'&&s.charAt(i)!='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i)+" is vowel in the string");
			}
			else {
				System.out.println(s.charAt(i)+" is consonant in the string");
			}
		}
		
		}
	}

