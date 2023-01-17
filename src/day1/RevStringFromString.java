package day1;

public class RevStringFromString {
	public static String rev(String str) {
		String ret="";
		String[] arr =str.split(" ");
		for(int i =arr.length-1;i>=0;i--) {
			ret=ret+arr[i]+" ";
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(RevStringFromString.rev("Antra Info Solution pvt ltd"));
	}

}
