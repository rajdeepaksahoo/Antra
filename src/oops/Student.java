package oops;

public class Student
{
	public static void greet()
	 {
	 System.out.println("Hello");
	 }
	 public static void greet(String name)
	 {
	 System.out.println("Hello " + name);
	 }
	 public static void main(String[] args)
	 {
		 greet();
		 greet("Sansa");
	 }
}
