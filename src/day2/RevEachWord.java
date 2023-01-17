package day2;

public class RevEachWord {
	public static String rev(String str) {
		String str1="";
		str=str.trim();
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]=arr[i].toLowerCase();
			for(int j=arr[i].length()-1;j>=0;j--) {
				if((j==arr[i].length()-1) && !(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='Z')) {
					str1=str1+(char)(arr[i].charAt(j));
				}
				else {
					str1=str1+(char)(arr[i].charAt(j)-32);
				}
			}
			str1=str1+" ";
		}
		str1=str1.trim();
		return str1;
	}
	public static void main(String[] args) {
		System.out.println(RevEachWord.rev("This Is Java"));
	}

}
