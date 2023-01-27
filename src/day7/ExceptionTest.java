package day7;

import java.util.*;

public class ExceptionTest {
//	public String lss(String str) {
//		String str1="";
//		int s=0,e=0;
//		for(int i=0;i<str.length();i++) {
//			
//		}
//		return str1;
//	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		List<Integer> ll = new ArrayList();
		List<Integer> sum = new ArrayList();
		
		l.add(3);
		l.add(4);
		l.add(2);
		
		ll.add(4);
		ll.add(6);
		ll.add(5);
		
		int s=0;
		int ss=0;
		boolean b =false;
		for(int i=0;i<l.size();i++) {
			s=l.get(i)+ll.get(i);
			if(s>9) {
				ss=s/10;
				s=s%10;
				sum.add(s);
			}else sum.add(s+ss);
			
		}
		System.out.println(sum);
	}
	
}	
