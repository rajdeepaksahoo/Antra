package oops;

public class Per
{
 public void speak()
 {
 System.out.println("I'm a person");
 }
 public static void main(String[] args)
 {
 Per p1 = new Stu();
 p1.speak();
 }
}
class Stu extends Per
{
	public void speak()
	 {
	 System.out.println("I'm a student");
	 }
}