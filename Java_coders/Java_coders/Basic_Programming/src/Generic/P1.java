package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		
//Print the sum of the collection
		List<Integer> a= Arrays.asList(1,2,3,4,5);
//		int sum=0;
//		for( int i=0;i<a.size();i++) {
//			sum=sum+a.get(i);
//		}
//		System.out.println(sum);
		
		
// Print only the even numbers from the collection
//List<Integer> a= Arrays.asList(1,2,3,4,5);

		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2==0) {
				System.out.println(a.get(i));
			}
		}
	}

}
