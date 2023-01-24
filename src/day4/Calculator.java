package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegValue extends Exception{
	NegValue (String msg){
		super(msg);
	}
}

public class Calculator {
	int a,b;
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int add() throws NegValue {
		if(a<0 || b<0) {
			throw new NegValue("Value Must Not Negetive");
		}
		return (a+b);
	} 
	
	public int sub() throws NegValue {
		if(a<0 || b<0) {
			throw new NegValue("Value Must Not Negetive");
		}
		return (a-b);
	} 

	public int div() throws NegValue {
		if(a==0 || b==0) {
			throw new ArithmeticException("Vallu Must Not 0");
		}
		return (a/b);
	} 
	
	public int mul() throws NegValue {
		if(a==0 || b==0) {
			throw new ArithmeticException("Vallu Must Not 0");
		}
		return (a*b);
	} 
	
	public static void main(String[] args)throws InputMismatchException {
		
		Scanner s = new Scanner(System.in);
		try {
			
			
				System.out.println("Enter First Value : ");
				int a=s.nextInt();
				System.out.println("Enter Second Value : ");
				int b=s.nextInt();
				Calculator c= new Calculator(a,b);
			System.out.println(c.add());
			
			System.out.println(c.sub());
			
			System.out.println(c.mul());
			
			System.out.println(c.div());
			
		}catch(NegValue nv) {
			System.out.println(nv.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch(InputMismatchException e){
			System.out.println("Wrong Input");
		}finally {
			s.close();
		}
	}

}
