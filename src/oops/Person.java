package oops;

public class Person
{
	 private String name;
	 private int age;
	 public Person(String name, int age)
	 {
		 this.name = name;
		 this.age = age;
	 }
	 public String getName() { return this.name; }
	 public int getAge() { return this.age; }
	 public String toString()
	 {
		 return getName() + " " + getAge();
	 }
	 public static void main(String[] args)
	 {
		 Person p = new Person("Destini", 20);
		 System.out.println(p);
		 Teacher p2 = new Teacher("Erica", 55, "Masters in Teaching");
		 System.out.println(p2);
	 }
}
class Teacher extends Person
{
	 String degree;
	 
	 public String getDegree() { 
		 return this.degree; 
	}
	 public String toString()
	 {
		 return getName() + " " + getAge() + " " + getDegree();
	 }
	 public Teacher(String name, int age, String theDegree)
	 {
		 super(name, age);
		 this.degree=theDegree;
	 }
}