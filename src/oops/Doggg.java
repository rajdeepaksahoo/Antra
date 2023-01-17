package oops;

abstract class Animal
{
 public String name;
 public int numLegs;
 public abstract void speak();
 public abstract void eat();
 public static void main(String[] args)
 {
 Doggg myDog = new Doggg();
 myDog.speak();
 myDog.eat();
 }
}

public class Doggg extends Animal
{
 // ADD CODE HERE
 public static void main(String[] args)
 {
 Doggg myDog = new Doggg();
 myDog.speak();
 myDog.eat();
 }

@Override
public void speak() {
	System.out.println("Woff");
	
}

@Override
public void eat() {
	System.out.println("num num");
}
}
