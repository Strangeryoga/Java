

//write a jva program to print the number from 1 to 10 without using loop




public class New2 {
	  static void print(int n) {
		 if(n<11) {
			 System.out.println(n);
			 n=n+1;
			 print(n);
		 }
	  }
	public static void main(String[] args) {
		int n=1;
		print(n);
	}


}
