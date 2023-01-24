package day4;

public class FindCombinationDS {

	public static void main(String[] args) {
		int [] arr = {'a','b','e','g','a','g'};
		int a =0,ans =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a') {
				a++;
			}
			if(arr[i]=='g' && a>0) {
				ans=ans+a;
			}
		}
		System.out.println(ans);
	}
	

}
