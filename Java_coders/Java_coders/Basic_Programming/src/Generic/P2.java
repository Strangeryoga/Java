package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P2 {
	int id;
	String name;
	double sal;
	
	
	public P2(int id,String name, double sal) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public String toString() {
		return id+" "+name+" "+sal;
	}
	
	public static void main(String[] args) {
//		List<P2> a=new ArrayList<>();
//		a.add(new P2(1,"naved",15000));
//		a.add(new P2(2,"nagesh sir",5000));
//		a.add(new P2(3,"bikash sir", 5000));
//		a.add(new P2(4,"vinay sir", 25000));
//		a.add(new P2(5,"ravi sir", 300000));
		
//		List<P2> res=a.stream().filter((e)->e.id%2==0).collect(Collectors.toList());
//		System.out.println(res);
		
		//List<P2> res=a.stream().filter(e->e.sal=e.
//		int sum = 0;
//			for(int i =0; i<a.size(); i++) {
//				sum=(int) (sum + a.get(i).sal);
//			}
//
//	
//		System.out.println(sum);
//		double res=a.stream().collect(Collectors.summingDouble(e->e.id));
//		System.out.println(res);
		
		
//		double res=a.stream().filter(e->e.name.startsWith("na")).collect(Collectors.summingDouble(e->e.sal));
//		System.out.println(res);
		
//		List<Integer> a=Arrays.asList(1,2,3,4,5);
//		List<Integer> res=a.stream().map(x->x*x*x).collect(Collectors.toList());
//		System.out.println(res);
		
		///WAJP to convert all the string elements from lower to  uppercase
		
		List<String> b=Arrays.asList("tejas","aniket","prince","shubham");
		System.out.println(b);
		List<String> res1=b.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(res1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
