package day1;
public class Prime {
	public static void main(String[] args) {
		int no=11;
		int fact=(int)Math.sqrt(no);
		int c=0;
		for(int i=2;i<fact;i++) {
			if(no%i==0)c++;
		}
		if(c==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}