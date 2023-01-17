package oops;

public class Dog extends Beagle
{
 public void speak()
 {
 System.out.println("woof!");
 }
 public static void main(String[] args)
 {
 Dog d = new Dog();
 d.speak();
 Beagle b = new Beagle();
 b.speak();
 }

}
 
 
class Beagle 
{
 public void speak()
 {
 System.out.println("arf arf");
 }
}
