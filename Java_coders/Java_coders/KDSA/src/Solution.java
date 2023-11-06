
import java.util.*;



public class Solution {
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
//	                     list.add(new pair(A[i],B[j], N, M));
	                     
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
	 


	//Search in Rotated Sorted Array
	public int search(int[] nums, int target) {
		//check if the input array is null or empty
		if(nums==null || nums.length==0) return -1;
		int l=0; //Initialize left pointer
		int r=nums.length-1;  //Initialize right pointer
		int m=0; //Initialize mid pointer

		// find out the index of the smallest element (pivot)
		while(l<r){
			m = (l+r)/2; //calculate mid index

			if(nums[m] > nums[r]){ //If nums[m]>nums[r], pivot is in right half
				l = m+1; //update left pointer
			}else{
				//If nums[m] <= nums[r], pivot is in the left half or at m
				r = m; //update right pointer
			}
		}

		//now we have found the index of the smallest element, store it in 's'
		int s = l;

		//reset left and right pointers for the binary search
		l = 0; r = nums.length-1;

		//check which half the target may be in and set the appropriate pointers
		if(target >= nums[s] && target <= nums[r]){
			l = s; //target is in the right half
		}else{
			r = s; //target is in the left half
		}
		// the binary search for the target
		while(l<=r){
			m = (l+r)/2; //calculate mid index
			if(nums[m]==target) return m;
			else if(nums[m] > target) r = m-1; //target is in the left half,
				//update right pointer
			else l=m+1; //target is in the right half, update left pointer
		}

		return -1; //target is not found in the array
	}


	//Longest Substring Without Repeating Characters
	public static int lengthOfLongestSubstring(String s) {
		// Check if the input string is empty
		if (s.length() == 0) {
			return 0;
		}

		// Initialize a HashMap to store characters and their indices
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// Initialize a variable to store the maximum substring length
		int max = 0;

		// Initialize two pointers, i and j, to define the sliding window
		for (int i = 0, j = 0; i < s.length(); ++i) {
			// Check if the character at index i is already in the map
			if (map.containsKey(s.charAt(i))) {
				// If it is, update the left pointer (j) to the next index after the last occurrence of the character
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}

			// Update the map with the current character and its index
			map.put(s.charAt(i), i);

			// Update the maximum substring length by taking the maximum of its current value
			// and the length of the current non-repeating substring (i - j + 1)
			max = Math.max(max, i - j + 1);
		}

		// Return the length of the longest substring without repeating characters
		return max;
	}


	//Valid Parentheses
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c:s.toCharArray()){
			if(c=='(') stack.push(')');
			else if(c=='{') stack.push('}');
			else if(c=='[') stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c) return false;
		}
		return stack.isEmpty();
	}


	public static void main(String[] args) {
//		int A[]= {1,2,4,5,7};
//		int B[]= {5,6,3,4,8};
//		int X=9;
//		Solution ref=new Solution();
//		
//		ref.allPairs(null, null, X, X, X);
		 
//		 String s="abcabcbb";
//		 System.out.println(s);
		String s="((";
		System.out.println(isValid(s));
	}

}
