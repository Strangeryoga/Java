
public class D1 {
	
	public static void Double(int ar[]) {
		boolean bool[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			int count=1;
			if(bool[i]==false) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					bool[j]=true;
				}
			}
			System.out.println(ar[i]+" "+count);
				
			}
			
		}
	
	}
	
	
	
	public static void main(String[] args) {
		int ar[]= {3,4,3,2,6,4};
//		int rem=0;
//		for(int i=0;i<ar.length;i++) {
//			 int d=ar[i]%6;
//			 System.out.println(ar[i]);
//			 System.out.println(d);
//			rem=rem+d;
//		}
//		System.out.println(" incrementing value we required is "+rem);
		
		Double(ar);

	}

}
