import java.util.Scanner;

public class AS{
	
	// Q41 ->convert decimal to binary 
	public static void AS1() {
		int a=8;
		int rem=0;
		String bin="";
		while(a!=0) {
			rem=a%2; 
			bin=bin+rem;
			a=a/2;
			
			

		}
		System.out.println(bin);
	}
	
	//Q42 -> convert decimal to binary in right order
	public static void AS2() {
		int a=8;
		int rem=0;
		String bin="";
		while(a!=0) {
			rem=a%2; 
			bin=rem+bin;
			a=a/2;
			

		}
		System.out.println(bin);
	}
	
	//Q43 ->convert decimal to octal
	public static void AS3() {
		int a=35;
		int rem=0;
		String bin="";
		while(a!=0) {
			rem=a%8;
			bin=bin+rem;
			a=a/8;
		}
		System.out.println(bin);
	}
	
	
	//convert decimal to hexadecimal
//	public static void AS4() {
//		int a=59;
//		int rem=0;
//		String hexa="";
//		while(a!=0) {
//			rem=a%16;
//			hexa=rem+hexa;
//			a=a/16;
//		}
//		System.out.println(hexa);
//				
//	}
	
	//Q44 ->convert decimal to hexadecimal
	public static void AS5() {
		int n=59;
		String hex="";
		while(n!=0) {
			int rem=n%16;
			switch(rem) {
			case 10: hex="A"+hex;
			break;
			case 11: hex="B"+hex;
			break;
			case 12: hex="C"+hex;
			break;
			case 13: hex="D"+hex;
			break;
			case 14: hex="E"+hex;
			break;
			case 15: hex="F"+hex;
			default: hex=rem+hex;
			break;
			
			}
			n=n/16; //3
		}
		
		System.out.println(hex);

	}
	
	
	public static void AS6() {
		int n=59;
		String hex="";
		while(n!=0) {
			int rem=n%16;
				if(rem==10) {
					System.out.println("A"+hex);
				}
				else if(rem==11) {
					System.out.println("B"+hex);
				}
				else if(rem==12) {
					System.out.println("C"+hex);
				}
				else if(rem==13) {
					System.out.println("D"+hex);
			}
				else if(rem<9||rem>14) {
					hex=rem+hex;
					
				}
			
			
			n=n/16; //3
		}
		
		System.out.println(hex);

	}
	
	
	
	//Q45 -> write a java program to convert binary into decimal
	
	public static void AS7() {
		int n=111;
		int pow=1;
		int sum=0;
		while(n!=0) {
			int rem=n%10; 
			sum=sum+(rem*pow);
			pow=pow*2;
			n=n/10;
			}
		System.out.println(sum);
			
		}
	

	
	//Q46 -> write a java program to convert binary into octal
	
	public static void AS8() {
		int n=111;
		int pow=1;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+(rem*pow);
			pow=pow*2;
			n=n/10;
		}
		System.out.println("binary to decimal "+sum);
		int a=sum;
		int rem1=0;
		String bin="";
		while(a!=0) {
			rem1=a%8;
			bin=bin+rem1;
			a=a/8;
		}
		System.out.println("decimal to octal "+bin);
		
		
		
	}
	
	//Q47 ->write a java program to convert binary into hexadecimal
	
	//binary to decimal
	public static void AS9() {
		int n=1111;
		int pow =1;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+(rem*pow);
			pow=pow*2;
			n=n/10;
		}
//		System.out.println(sum);
		int m=sum;
		String hex="";
		while(m!=0) {
			int rem1=m%16;
			switch(rem1) {
			case 10: hex="A"+hex;
			break;
			case 11: hex="B"+hex;
			break;
			case 12: hex="C"+hex;
			break;
			case 13: hex="D"+hex;
			break;
			case 14: hex="E"+hex;
			break;
			case 15: hex="F"+hex;
			break;
			default: hex=rem1+hex;
			break;
			
			}
			m=m/16; //3
		}
		
		System.out.println(hex);
		
	}
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		
	AS ref=new AS();
//	ref.AS1();
//	ref.AS2();
//	ref.AS3();
//	ref.AS4();
//	ref.AS5();
	ref.AS6();
//	ref.AS8();--
//	ref.AS9();


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}