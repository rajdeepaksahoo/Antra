package day1;

public class StringComp {
	public static String comp(String str) {
		String str1="";
		String str2="";
		for(int i = 0;i<str.length();i++) {
			int c=0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(!str2.contains(str.valueOf(str.charAt(i)))) {
				str1=str1+str.charAt(i)+c;
			}
			str2=str2+str.charAt(i);
		}
		
		
		return str1;
	}
	public static void main(String[] args) {
		System.out.println(StringComp.comp("abbccccddd"));

	}

}
