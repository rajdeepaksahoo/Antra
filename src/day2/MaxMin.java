package day2;

public class MaxMin {
	public static void maxMin(int[] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])max=arr[i];
			else if(min>arr[i])min =arr[i];
		}
		System.out.println("Max : "+max+"\nMin : "+min);
	}
	public static void main(String[] args) {
		int[] arr = {3,-9,4,21,8,9,2,-2};
		MaxMin.maxMin(arr);
	}

}
