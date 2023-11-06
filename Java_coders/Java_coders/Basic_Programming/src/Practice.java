
public class Practice {
		public static void prime(int n) {
			int f=2;
			int d=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					d++;
				
			}
		}
			if(f==d) {
				System.out.println("it -i prime");
		}
			else {
				System.out.println("no");
			}
		}
	public static void main(String[] args) {
		//check whether the number is Palindrome or not
		//check whether the number is prime or not
		//check whether the number is prime or not range from 5 to 12
		//check whether the number is perfect or not
		//check whether the number is perfect or not in the range 10 to 30
		//write a java program to print first 5 fibonnaci  series
		//check whether theh number is special or not
		//check wthether the number is harshad no. or not n%sum==0
		
		
		prime(7);
		
	}
}