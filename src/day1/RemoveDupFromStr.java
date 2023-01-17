package day1;

public class RemoveDupFromStr {
	public static String ret(String str) {
		String ret="";
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(c==1) {
				ret=ret+str.charAt(i);
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(RemoveDupFromStr.ret("asdarf"));
	}

}
