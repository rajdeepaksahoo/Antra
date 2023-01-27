package day7;

public class SumOfCollum {
	public static int highest(int[][] arr) {
		int highest=0;
		
		for(int i=0;i<arr[0].length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j][i];
			}
			if(highest<sum)highest=sum;
		}
		
//		int i = 0;
//		int j= 0;
//		int sum=0;
//		while(i<arr[0].length) {
//			sum=sum+arr[j][i];
//			if(highest<sum)highest=sum;
//			j++;
//			if(j==arr.length) {
//				j=0;
//				sum=0;
//				i++;
//			}
//			
//		}
		
		return highest;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		System.out.println("Highest Collum Sum is : "+SumOfCollum.highest(arr));
	}

}
