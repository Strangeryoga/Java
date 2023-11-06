import java.util.Scanner;

// Q1-> Write a java Program to calculate the product of a number in the given range 1 to 5

public class P1 {
	public static void main(String[] args) {
//        P_1 re=new P_1();
//        re.p1();
//		P2 ref=new P2();
//		ref.P2();
//		P3 ref1=new P3();
//		ref1.P3();
//		P4 ref2=new P4();
//		ref2.P4();
//		P5 ref3=new P5();
//		ref3.P8();
		P6 ref3=new P6();
		ref3.P6();
//		P7 ref5=new P7();
//		ref5.P7();
//		P8 ref6=new P8();
//		ref6.P8();
//		P9 ref7=new P9();
//		ref7.P9();
//		P10 ref8=new P10();
//		ref8.P10();
//		P12 ref9=new P12();
//		ref9.P12();
//		P13 ref9=new P13();
//		ref9.P13();
//		P14 ref9=new P14();
//		ref9.P14();
//		P15 ref9=new P15();
//		ref9.P15();
//		P16 ref10=new P16();
//		ref10.P16();
//		P17 ref10=new P17();
//		ref10.P17();
//		P18 ref10=new P18();
//		ref10.P18();
//		P19 ref10=new P19();
//		ref10.P19();
//		P20 ref11=new P20();
//		ref11.P20();
//		P21 ref11=new P21();
//		ref11.P21();
//		P23 ref11=new P23();
//		ref11.P23();
//		P25 ref11=new P25();
//		ref11.P25();
//		P26 ref12=new P26();
//		ref12.P26();
//		P27 ref13=new P27();
//		ref13.P27();
//		P28 ref14=new P28();
//		ref14.P28();
//		P29 ref14=new P29();
//		ref14.P29();
//		P30 ref14=new P30();
//		ref14.P30();
//		P32 ref14=new P32();
//		ref14.P32();
//		P33 ref14=new P33();
//		ref14.P33();
//		int n=5;
//		P35 ref15=new P35();
//		ref15.factorial(n);
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		P36 ref15=new P36();
//		ref15.prime(n);
//		System.out.println("Enter the number: ");
//Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		P37 ref15=new P37();
//		ref15.perfect(n);
//		
//        Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		P38 ref15=new P38();
//		System.out.println(ref15.count(n));
//		 Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			P39 ref15=new P39();
//			ref15.power(n);
//		 Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			P40 ref15=new P40();
//			ref15.armStrong(n);
//		 Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			P41 ref15=new P41();
//			System.out.println(ref15.count(n));
		
		
	}

}

//Q1-> Write a java Program to calculate the product of a number in the given range 1 to 5

class P_1{
	public static void p1() {
		int product=1;
		for(int i=1; i<=5; i++) {
			product=product*i;
		}
		System.out.println("product of the number: "+product);
		System.out.println("=============");
	}
	
}


// Q2-> Write a java program of sum of all even numbers in the range of 5 to 12

class P2{
	
	
	public static void P2() {
	int sum=0;
	for(int i=5; i<=12; i++) {
		if(i%2==0) {
			sum=sum+i;
			
		}
	}
	System.out.println("sum of all even numbers: " + sum);
	System.out.println("=============");

}

}

// Q3 ->Write a java program to print the product of all even numbers and the range is 5 to 12

class P3{
	public static void P3() {
		int p=1;
		for(int i=5; i<=12; i++) {
			if(i%2==0) {
			
			p=p*i;
		}
	}
	System.out.println("product of all even numbers: "+p);
	System.out.println("=============");

}
}

// Q4 -> Write a java program to print the product of all odd numbers in the range of 5 to 12

class P4{
	public static void P4() {
		int p=1;
		for(int i=5; i<=12; i++) {
			if(i%2==1) {
				p=p*i;
			}
		}
		System.out.println("product of all odd numbers: "+p);
		System.out.println("=============");

	}
}

// Q5 -> Write a java program to print factorial a number 

class P5{
	
	public static void P8() {
		int s=1;
		int n=6;
		while(n>=1) {
			s=s*n;
			n--;
		}
		System.out.println(s);
	}
	
	
	
	public static void P5() {
		int f=1;
		for(int i=5; i>=1; i--) {
			f=f*i;

		}
		System.out.println("factorial of number: "+f);
		System.out.println("=============");

	}
}


// Q6 -> Write a java program to print factorial of a number in the given range and the range starts from 1 to 10

class P6{
	public static void P6() {
		Scanner sc=new Scanner(System.in);
		int f=1;
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			f=f*i;
			System.out.println("factorial of a " +i +" is " +f);

		}
		System.out.println("=============");

	}
}


class P7{
	public static void P7() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number from 1 to 10 and check its factorial : " );
		  int f=1;

		for(int j=sc.nextInt(); j<=10; j++)
			  {
// Q7 -> calculate the factorial of a single 
			 for (int i=1; i<=j; i++)
			  {
			  f=f*i;
			  }
			  System.out.println("factorial of a number " +j + " is " +f);
	}
}
}

// Q8 -> Write a java program to print the sum of two numbers

class P8{
	public static void P8() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number 2");
		int num2=sc1.nextInt();
		int ans=num1+num2;
		System.out.println(ans);
		
	}
}

// Q9 -> Write a java program to swap two numbers by using third variable

class P9{
	public static void P9() {
		int a=10;
		int b=20;
		int c;
		System.out.println("Before swap");
		System.out.println("the value of a is " +a);
		System.out.println("the value of b is " +b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("After swap");
		System.out.println("the value of a is now : "+a);
		System.out.println("the value of b is now : "+b);
	}
}

// Q10 -> write a java program to swap two numbers without any third variable 

class P10{
	public static void P10() {
		int a=10;
		int b=20;
		System.out.println("before swap");
		System.out.println(a+" "+b);
		a=a+b-10;
		b=a-b+10;
		System.out.println("after swap");
		System.out.println(a+" "+b);
	}
}



//Q11 -> WAJP to print the factors of a number
class P11{
	public static void P10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
			System.out.println(i);
		}
		}
	}
}

//Q12 -> WAJP to count the number of factors of a number

class P12{
	public static void P12() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				sum++;
				System.out.println(i);
		}
		}
		System.out.println("no of factors of a number  " + a + " is " +sum);


	}
}



//Q13 -> write a java program to count the number of factors in the given range 1 to 10

class P13{
	public static void P13() {
		for(int a=1; a<=10 ;a++) {
		int count=0;
		for(int i=1; i<=10; i++) {
			if(a%i==0) {
//				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("count of factors of a is "+ a + " -> " +count);

	}

}

}


//Q14 ->write a java program to print digits from a number in reverse

class P14{
	public static void P14() {
		int n=12453;
		while(n!=0){
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
			
		}
	}


//Q15 ->write a java program to calculate the sum of digits of a number

class P15{
	public static void P15() {
		int n=1234;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
			sum=sum+d;
		}
		System.out.println(sum);

	}

}

//Q16 ->write a java program to calulate the product of a digits of a number

class P16{
	public void P16() {
		int n=1234;
		int product=1;
		while (n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
			product=product*d;
			
			
		}
		System.out.println(product);
	}
}


//Q17 ->write a java program to print all the even digits from a number

class P17{
	public void P17() {
		int n=1234;
		
		while(n!=0) {
			int d=n%10;
			if(d%2==0) {
				System.out.println(d);
			}
			n=n/10;
			
			
		}
		
	}
}



//Q18 ->write a java program to print the sum of all even digits along with product of all even digits of a number


class P18{
	public void P18() {
		int n=123;
		int sum=0;
		int mul=1;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
			sum=sum+d;
			mul=mul*d;
		}
		System.out.println("sum of all the digits are: "+sum);
		System.out.println("product of all the digits are: "+mul);
	}
}


//Q19 ->write a java program to print the product of odd digits and sum of odd digits of a number


class P19{
	public void P19() {
		int n=12345;
		int mul=1;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			if(d%2!=0) {
				System.out.println(d);
				sum=sum+d;
				mul=mul*d;
			}
			
			n=n/10;
		}
		System.out.println("sum of the number is: "+sum);
		System.out.println("product of the number is: "+mul);

	}
}



//Q20 ->write a java program to check whether the number is Palindrome or not

class P20{
	public void P20() {
		int n=121;
		int temp=n;
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("number is Pali");
		}
		else {
			System.out.println("number is not Pali");
		}
		
	}
	
}



//Q21 -> write a java program to check whether the number is prime number or not 

class P21{
	public void P21(){
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			int count=0;
			for(int i=1; i<=10; i++) {
				if(a%i==0) {
					count++;
				}			
			}		
			if(count<=2) {
				System.out.println("It is prime number");
			}
			else {
				System.out.println("it is not prime");
			}
		}		
	}	
	
//output It is prime or not

//Q22 ->write a java program to check whether a number is prime or not in the range from 5 to 11

class P22{
	public void P22(){
		for(int a=5; a<=11 ;a++) {
			int count=0;
			for(int i=1; i<=a; i++) {
				if(a%i==0) {
					count++;
				}
				 
			}
			if(count<=2) {
				System.out.println("It is prime number ->" +  a);
			}
			else {
				System.out.println("It is not prime ->" +a);
			}

		}
	
		
			
		}
	}
		
// factorial of number: 120
//=============
//It is prime number ->5
//It is not prime ->6
//It is prime number ->7
//It is not prime ->8
//It is not prime ->9
//It is not prime ->10
//It is prime number ->11*





//Q23 ->write a java program to check whether a number is perfect number or not

class P23{
	public void P23() {
		int n=28;
		int sum=0;
		for(int i=1; i<=n; i++) { //i<n
			if(n%i==0) {
				sum=sum+i;
			}
		}
		sum=sum -n;
		if(sum==n) {
			System.out.println("It is perfect no");
		}
		else {
			System.out.println("It is not prefect no");
		}
		
		
		
	}
	
}


// Palindrome Tracing

//int n=121; int sum=0;
//int temp=n; int rem=0;
//while(n!=0)
//{
//rem=n%10;
//sum=sum*10+rem;
//n=n/10;
//}
//if(sum==temp)


//Q24 -> write a java program to print the perfect number in the range 10 to 35




class P24{
	public void P24() {
		for(int n=10;n<36;n++) {
		int sum=0;
		for(int i=1; i<n; i++) { //i<n
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" it is perfect no");
		}
		
		
		
		
	}
	
}

}


//Q25 ->write a java program to print the first 5 fibonacci series


class P25{
	public void P25() {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+  b) ;
		for(int i=2;i<5;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		
			
			
			
		}
		
	}
}



//Q26 ->write a java program to print the first 10 fibonacci series

class P26{
	public void P26() {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+  b) ;
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		
			
			
			
		}
		
	}
}


//Q27 ->write a java program to check whether the number is special number or not


class P27{
	public void P27() {
		int n=19;
		int temp=n;
		int sum=0;
		int pro=1;
		int total=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			pro=pro*d;
			total=sum+pro;
			
			n=n/10;
		}
		if(total==temp) {
			System.out.println(temp+" is a special number");
		}
		else {
			System.out.println(temp+" is not special number");
		}
	}
}


//Q28 ->write a java program to print all the special numbers from 18 to 51


class P28{
	public void P28() {
		for(int i=18;i<=51;i++) {
		int n=i;
		int temp=n;
		int sum=0;
		int pro=1;
		int total=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			pro=pro*d;
			total=sum+pro;
			
			n=n/10;
		}
		if(total==temp) {
			System.out.println(temp+" is a special number");
		}
			
		
		
		
		
//		
	}
}

}


//Q29 ->write a java program to check whether the number is spy number or not

class P29{
	public void P29() {
		int n=32;
		int temp=n;
		int sum=0;
		int pro=1;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			pro=pro*d;
//			System.out.println(d);
			n=n/10;
		}
//		System.out.println(sum);
//		System.out.println(pro);
		if(sum==pro) {
			System.out.println(temp+" is spy number");
		}
		else {
			System.out.println(temp+" is not a spy number");
		}

	}
}



//Q30 ->write a java program to check whether the number is harshad number or not

class P30{
	public void P30() {
		int n=27;
		int temp=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
//			System.out.println(d);
			sum=sum+d;
     		n=n/10;
		}
//		System.out.println(sum);
		if(temp%sum==0) {
			System.out.println(temp+" is harshad number");
		}
		else {
			System.out.println("It is not harshad number");
		}
		
	}
}



//class P31{
//	public void P31() {
//		for(int n=20;n<=50;n++) {
//			int temp=n;
//			int sum=0;
//			
//		}
//	}
//}




//Q31 ->write a java program to print the table of 2

class P32{
	public void P32() {
		int n=3;
//		int temp=n;
		int pro=1;
		for(int i=1;i<=10;i++) {
			pro=n*i;
			System.out.println(n+ " * " +i+ " = " +pro);

		}
	}
}


// * Q32 -> write a java program to check whether the number is strong number or not 

class P33{
	public void P33() {
		int n=145;
		int temp=n;
		int sum=0;
		
		while(n!=0) {
			int fact=1;
			int d=n%10;
			for(int i=1;i<=d;i++) {// to calculate the factorial
					fact=fact*i;
				}
				sum=sum+fact;
				n=n/10;
		}
			if(temp==sum) {
				System.out.println("It is strong number");
			}
			else {
				System.out.println("It is not a strong number");
			}
			

		
	
}

}


//Q33 ->write a java program to find the number of a perfect square number

class P34{
	public void P34() {
		int n=25;
		int temp=n;
		int pro=1;
		while(n!=0) {
			int d=n%10;
			n=n/10;
			System.out.println(d);
			pro=pro*d;
		}
		System.out.println(pro);
		
	}
}


//Q34 ->write a java program to calulate the factorial of a number using method

class P35{
	public static void factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("factorial of "+n+" is "+f);
	}
}


//Q35 ->write a java program to check whether the number is prime or not

class P36{
	public static void prime(int n) {
		int fact=2;
		int s=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				s++;
			}
			
		}
		if(fact==s) {
			System.out.println("It is prime");
		}
		else {
			System.out.println("It is not");
		}
	}
}


//Q36 ->write a java program to check whether the number is perfect no or not

class P37{
	public static void perfect(int n) {
		int temp=n;
		int sum=0;
		int pro=1;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
			
		}
		if(temp==sum) {
			System.out.println("It is perfect number");
		}else {
			System.out.println("It is not a perfect number");
		}
	}
}


//Q37 ->write a java program to count the number of digits of a number using method


class P38{
	public static int count(int n) {
		int temp=n;
		int count=0;
		while(n!=0) {
//			int d=n%10;
			count++;
			n=n/10;
			
		}
//		System.out.println(count);
		return count;
		
		
	}
}



//Q38 ->write a java program to calculate raise to the power a number

class P39{
	public static void power(int n) {
		
		int pro=1;
		int raise=3;
		for(int i=1;i<=n;i++) {
			pro=pro*raise;
		
		}
		System.out.println(pro);
	}
//		
	
}



//Q39 ->write a java program to check whether the number is amstrong number or not

class P40{
	public static void armStrong(int a) {
		int x=a;
		int count=0;
		while(a!=0) {
			int d=a%10;
			count=count+d*d*d;
			a=a/10;
		}
		if(count==x) {
			System.out.println("It is a ArmStrong No");
		}
		else {
			System.out.println("It is not an ArmStrong No");
		}
		
	}
}




class P41{
	public static int count(int n) {
		int count=0;
		int countOfDigit=count;
		int f=1;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			for(int i=1;i<=countOfDigit;i++) {
				f=f*d;
				sum=sum+f;

			}
			count++;
			n=n/10;
			System.out.println(sum);


		}
		return count;
		
		
	
	}
}


























