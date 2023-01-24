package day3;
public class PrifixSum {
	public static void main(String[] args) {
		int[] arr = {10,1,-3,4,8,11};
		int[][] con = {{0,1},{1,2},{2,3},{0,5}};
		int[] ps = new int[arr.length];
		ps[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			ps[i]=ps[i-1]+arr[i];
		}
		for(int i=0;i<con.length;i++) {
			int s=con[i][0],e=con[i][0];
			if(con[i].length==2) {
				s=con[i][0];
				e=con[i][1];
			}
			if(con[i].length==1) {
				System.out.print(arr[e]+" ");
			}
			else if(s==0) {
				System.out.print(ps[e]+" ");
			}
			else {
				System.out.print(ps[e]-ps[s-1]+" ");
			}
		}
		System.out.println();
		for(int i: ps) {
			System.out.print(i+" ");
		}
	}
}