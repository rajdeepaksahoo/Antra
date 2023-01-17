package day1;

public class Anagram {
	public static boolean anagram(String s1,String s2,int k) {
		boolean b=true;
		if(s1.length()==s2.length()) {
			int c=0;
			for(int i=0;i<s1.length();i++) {
				if(!(s1.contains(s1.valueOf(s2.charAt(i))))) {
					c++;
				}
			}
			if(c>3) b=false; 
		}else {
			b=false;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(Anagram.anagram("madam", "hgtdm",3));
	}

}
