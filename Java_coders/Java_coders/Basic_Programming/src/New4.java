import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class New4 {
//	static int digits2(int num) {
//		if(num<0) {
//			num=num*-1;
//		}
//		return (int)(Math.log10(num))+1;
//	}
//	public int getConcatenation(int [] nums) {
//		int n=nums.length;
//		int [] nums2=new int[2*n];
//		
//	}
//	return nums2;

	public static void main(String[] args) {
//		System.out.printf("Hello my name is %s and I am a %s","Tejas","student");
//		System.out.printf("Todays date is %t",'5');
//		String name="Tejas Doke";
//		System.out.println(Arrays.toString(name.toCharArray()));
//		String series="";
//		for(int i=0;i<26;i++) {
//			char ch=(char)('a'+i);
//			series=series+ch;
//			System.out.println(ch);
//		}	
//		System.out.println(digits2(890977));
		int nums[]= {1,2,1};
		int n=nums.length;
		int nums2[]=new int[2*n];
		int m=nums2.length;
		for(int i=0;i<n;i++) {
			nums2[i]=nums[i];
			nums2[i+n]=nums[i];
		}
		for(int i:nums2) {
			System.out.println(i);
			
		}
				
	
	
	}}