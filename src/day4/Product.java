package day4;

import java.util.Scanner;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
} 

public class Product {
	public int productCheck(int weight) throws MyException {
		if(weight<100) {
			throw new MyException("Invalid Product !!!");
		}
		return weight;
	}
	public static void main(String[] args) throws MyException {
		Product p = new Product();
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter Weight");
		System.out.println("Weight Is : "+p.productCheck(s.nextInt()));
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			s.close();
		}
	}

}
