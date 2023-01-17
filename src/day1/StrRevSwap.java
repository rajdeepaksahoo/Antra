package day1;

public class StrRevSwap {

	public static void main(String[] args) {
		String str="Antra";
		String[] str1=str.split("");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
//		int s=0;
//		int e=str.length()-1;
//		while(s<e) {
//			char ch = str.charAt(s);
//			char ch1 = str.charAt(e);
//			//System.out.println(ch+" "+str.charAt(e));
//			str=str.replace(str.charAt(s),ch1);
//			str=str.replace(ch1,ch); 
//			s++;
//			e--;
//		}
		System.out.println(str);
	}

}
