package day1;

public class DupWord {
	public static String[] dup(String str) {
		String[] splt = str.split(" "); 
		int l=0;
		
		for(int i=0;i<splt.length;i++) {
			int c=0;
			for(int j=i;j<splt.length;j++) {
				if(splt[i].equals(splt[j])) {
					c++;
				}
			}
			if(c==2) l++;
		}
		String[] ret = new String[l];
		int k=0;
		for(int i=0;i<splt.length;i++) {
			int c=0;
			for(int j=i;j<splt.length;j++) {
				if(splt[i].equals(splt[j])) {
					c++;
				}
			}
			if(c==2) {
				ret[k]=splt[i];
				k++;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		String[] arr = DupWord.dup("Hello Raz Hello India Hello Hello Hello");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
