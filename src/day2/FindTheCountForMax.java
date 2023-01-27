package day2;

public class FindTheCountForMax {
	public static void find(int[] arr) {
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				c++;
			}
		}
		System.out.println("Count is : "+(arr.length-c));
	} 
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		FindTheCountForMax.find(arr);
	}

}