package day2;

import java.util.StringJoiner;

public class RevEachWord1 {
	public static String rev(String str) {
		String str1="";
		str=str.toUpperCase();
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb= new StringBuffer(arr[i]).reverse();
			String f=sb.substring(0,1).toLowerCase();
			String l=sb.substring(1);
			StringJoiner sj = new StringJoiner(f, l, " ");
			str1=str1+sj;
		}
		
		return str1;
	}
	public static void main(String[] args) {
		System.out.println(RevEachWord1.rev("this is java"));

	}

}
