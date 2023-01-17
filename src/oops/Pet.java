package oops;

public class Pet
{
	 public void brag()
	 {
		 System.out.println("I have the best pet!");
	 }
	 public static void main(String[] args)
	 {
		 Dogg d1 = new Dogg();
		 d1.brag();
	 }
}
class Dogg extends Pet
{
	 public void brag()
	 {
		 super.brag();
		 System.out.println("I have the best dog!");
	 }
}
