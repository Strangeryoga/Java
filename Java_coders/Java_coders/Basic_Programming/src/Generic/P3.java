package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Integer> a=new ArrayList<>();
		boolean b=true;
		while(b) {
			System.out.println("Enter the number");

			int n=sc.nextInt();
			if(n!=-1) {
				a.add(n);
			}else {
				b=false;
			}
		}
		System.out.println(a);
		
		
//		List<Integer> a=Arrays.asList(1,2,3,4,5);
////		a.stream().filter(x->x%2==0).forEach(len->System.out.println(len*len*len));;
//		a.stream().filter(x->x%2==0).map(len->len*len*len);
		
//		String s="Java";
//		s=s.concat(" Development");
//		System.out.println(s);
		
		
		
		

			
			
		}
	}

