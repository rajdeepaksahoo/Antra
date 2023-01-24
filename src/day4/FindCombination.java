package day4;

public class FindCombination {

	public static void main(String[] args) {
		int c=0;
		int [] arr = {'a','b','e','g','a','g'};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]=='a' && arr[j]=='g')c++;
			}
		}
		System.out.println(c);
	}

}
