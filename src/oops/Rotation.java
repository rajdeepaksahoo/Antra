package oops;

public class Rotation {
	
	public static int[] rot(int[] arr,int s,int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;e--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int k=3;
		Rotation.rot(arr, 0, arr.length-1);		
		Rotation.rot(arr, 0, k-1);
		Rotation.rot(arr, k, arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}