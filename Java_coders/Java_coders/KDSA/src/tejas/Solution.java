package tejas;


import java.util.ArrayList;
import java.util.Arrays;


class Solution {
	class pair{
		long A,B,N,M;
		
		public pair(long A, long B,long N, long M) {
			this.A=A;
			this.B=B;
			this.N=N;
			this.M=M;
		}
	}
	 public static pair[] allPairs( long A[],long B[],long N, long M, int X) {
		 ArrayList<pair> list = new ArrayList();
	        Arrays.sort(A);

	        Arrays.sort(B);
	        
	          int k=0;
	       for(int i=0; i<N; i++)
	       {
	          
	           for(int j =0; j<M; j++)
	           {

	               if(A[i]+B[j]==X)
	               {
//	                     list.add(new pair(A[i],B[j]));
	                     
	               }
	               
	           }
	       }
	       pair[] pairs = new pair[list.size()];
	       for(int i=0;i<list.size();i++)
	       {
	           pairs[i]=list.get(i);
	         
	       }
	       return pairs;
	    }
	 
	 public static void main(String[] args) {
		int A[]= {1,2,4,5,7};
		int B[]= {5,6,3,4,8};
		int X=9;
		Solution ref=new Solution();
		
		ref.allPairs(null, null, X, X, X);
	}

	
}
		