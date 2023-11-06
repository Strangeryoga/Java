import java.util.ArrayList;
import java.util.Scanner;

public class stringOne {
	
	static String Reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);			
			}
		return rev;	
			}
		
		
	public static void sort(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int z=i+1;z<ch.length;z++) {
				if(ch[i]>ch[z]) {
					char temp=ch[i];
					ch[i]=ch[z];
					ch[z]=temp;			
				}
			}}	
	}
	
	public static void main(String[] args) {
		//write a jva program to print the string line by line
		
//		String s="welcome to java world";
//		String st[]=s.split(" ");
//		for(int i=0;i<st.length;i++) {
//			System.out.println(st[i]);
//		}
		
		//write a java program to reverese the string 
		
//		String s="welcome to java world";
//		String st[]=s.split(" ");
//		for(int i=st.length-1;i>=0;i--) {
//			System.out.println(st[i]+ " ");
//		}
		
		//=================================================//
		
		
		//write a java program to revese the word without reversing the position of the words
		
//		String s="welcome to java world";
//		String st[]=s.split(" ");
//		for(int i=0;i<st.length;i++) {
//			st[i]=Reverse(st[i]);
//		}
//			String rev="";
//			for(int j=st[i].length()-1;j>=0;j--) {
//				rev=rev+st[i].charAt(j);
//				
//			}
//			System.out.print(rev+" ");
//			
//			}
		
//		for(int i=0;i<st.length;i++) {
//			System.out.print(st[i]+" ");
//		}
		
		
//		String ar[]= {"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
////		System.out.println(ar);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter color");
//		String s=sc.next();
//
//			if(s=="Violet"||s=="Indigo"||s=="Blue"||s=="Green"||s=="Yellow"||s=="Orange"||s=="Red") {
//				System.out.println("It is a Color");
//			}
		
		//=========================================================//
		
		//Write a java to sort the characters present in the string
//		String s="javedZY";
//		char ch[]=s.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if(ch[i]>ch[j]) {
//					char temp=ch[i];
//					ch[i]=ch[j];
//					ch[j]=temp;
//					
//				}
//			}
//			System.out.println(ch[i]);
//		}
		
		//=======================================================//
		
		//write a java program to find the word with smallest length present in the string
		
//		String s="welcome to java classes";
//		String str[]=s.split(" ");
//		for(int i=0;i<str.length;i++) {
//			for(int j=i+1;j<str.length;j++) {
//				if(str[i].length()>str[j].length()) {
//					String temp=str[i];
//					str[i]=str[j];
//					str[j]=temp;
//				}
//			}
//			System.out.print(str[i]+" ");
//		}
		
		
		//without using swapping
		
//		String s="welcome to java classes";
//		String str[]=s.split(" ");
//		for(int i=0;i<str.length;i++) {
//			for(int j=i+1;j<str.length;j++) {
//				
//			}	
//			System.out.print(str[i]+" ");
//			
//		}
		
		
		//====================================================//
		
		//Write a java program to check the string is anagram or not
		//string s="heart"
		//string s1="earth"
		//string s & s1 are anagram
		//string s2="eat"
		//string s1 & s2 are not anagram
		
		
//		String s="heart";
//		String j="earth";
//		char m1[];
//		char ch[]=s.toCharArray();
//		char ch1[]=j.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			for(int z=i+1;z<s.length();z++) {
//				if(ch[i]>ch[z]) {
//					char temp=ch[i];
//					ch[i]=ch[z];
//					ch[z]=temp;
//					
//				}
//			}
//			System.out.print(ch[i]);
//			
//			
//			
//		}
//		System.out.println();
//		
//		for(int k=0;k<j.length();k++) {
//			for(int l=k+1;l<j.length();l++) {
//				if(ch[k]>ch[l]) {
//					char temp1=ch[k];
//					ch[k]=ch[l];
//					ch[l]=temp1;
//					
//				}
//			}
//			System.out.print(ch[k]);
//		String s1="earth";
//		if(s==s1) {
//		char ch[]=s.toCharArray();
//		char ch1[]=s1.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			System.out.print(ch[i]+" ");
//		}
//		System.out.println();
//		
//		for(int j=0;j<s1.length();j++) {
//			System.out.print(ch1[j]+" ");
//		}
		
		
		//============================================//
		
		//Write a java program to check the string is anagram or not

		
//		String s="heart";
//		String j="earth";
//		char ch[]=s.toCharArray();
//		char ch1[]=j.toCharArray();
//		
//		int count=0;
//		boolean bool[]=new boolean[ch.length];
//		for(int i=0;i<ch.length;i++) {
//			for(int k=0;k<ch1.length;k++) {
//				if(ch[i]==ch1[k] && bool[i]==false) {
//					count++;
//					bool[i]=true;
//				}			
//			}	
//		}
//		
//		if(count==ch1.length) {
//			System.out.println("this is Anagram");
//		}
//		else {
//			System.out.println("this is not Anagram");
//		}
		
		
		//========================================================//
		

//		String s="heart";
//		String j="earth";
//		String temp1="";
//		String temp2="";
//		char ch[]=s.toCharArray();
//		char ch1[]=j.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			for(int z=i+1;z<s.length();z++) {
//				if(ch[i]>ch[z]) {
//					char temp=ch[i];
//					ch[i]=ch[z];
//					ch[z]=temp;
//					
//				}
//
//			}
////			System.out.print(ch[i]);	
//			temp1=temp1+ch[i];
//
//	}
//		for(int i=0;i<j.length();i++) {
//			for(int z=i+1;z<j.length();z++) {
//				if(ch1[i]>ch1[z]) {
//					char temp=ch1[i];
//					ch1[i]=ch1[z];
//					ch1[z]=temp;
//					
//				}
//
//			}
////			System.out.print(ch1[i]);	
//			temp2=temp2+ch1[i];
//
//	}
//		
//		if(temp1.equals(temp2)) {
//			System.out.println("it is anagram");
//		}
//		else {
//			System.out.println("no its not");
//		}
//		
		
		//==================================================//
		
		
		String s="heart"; 
		String s1="earth"; 
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		
		sort(ch);
		sort(ch1);
		
		int temp=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch1[i]) {
				temp=1;
			}
		}
		if(temp==0) {
			System.out.println("string is anagram");
		}
		else {
			System.out.println("no it not");
		}
		
		
		//=============================================================//
		
		///Write a java program to short the string array in lexicographical order
		
//		String s[]= {"dd","bb","ee","aa"};
//		
//		String obj1="B";
//		String obj2="A";
//
//		
//
//		int value=obj1.compareTo(obj2);
//		System.out.println(value);

		
		//---------------------------------------------------------------
		
//		String s[]= {"dd","cc","bb","aa"};
//		System.out.println("Before sorting:-> ");
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i]+" ");
//		}
//		for(int i=0;i<s.length;i++) {
//			for(int j=i+1;j<s.length;j++) {
//				if((s[i].compareTo(s[j]))>0) {
//					String temp=s[i];
//					s[i]=s[j];
//					s[j]=temp;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("After sorting:-> ");
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i]+" ");
//		}
		
		
		//===================================================================//
		
//		String s="JAVA";
//		s=s.toLowerCase();
////		System.out.println(s);
//		
//		
//		String s1 ="java";
//		s1=s1.toUpperCase();
//		System.out.println(s1);
//		
//		
//		String s2="java is a programming language";
//		s2=s2.substring(0,4);
//		System.out.println(s);
		
		
//		String s="j#v# is # progr#mming l#ngu#e";
//		s=s.replace('#','a');
//		System.out.println(s);
		
//		String s="Aniket";
//		System.out.println(s);
//		System.out.println("la replace kela ");
//		s=s.replace("Aniket", "Vaibhav");
//		System.out.println(s);
//		System.out.println("ne");
				
		
//		StringBuffer st=new StringBuffer("Sachin");
//		StringBuffer st1=new StringBuffer(" Tendulakr");
//		st.append(" Tendulkar");
//		st.insert(6, st1);
//		st.replace(0, 6, "Tendulkar");
//		st.delete(0, 6);
//		st.reverse();
//		System.out.println(st);
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
