package oops;

public class Persons implements Comparable<Persons>
{
 private String name;
 private int age;
 public Persons(String name, int age)
 {
 this.name = name;
 this.age = age;
 }
 
 @Override
 public int compareTo(Persons p1)
 {
	 if(this.age>(p1.age)) {
		 return 1;
	 }else if(this.age<(p1.age)) {
		 return -1;
	 }else {
		 return 0;
	 }
 }
 public static void main(String[] args)
 {
	 Persons p1 = new Persons("Carlos",17);
	 Persons p2 = new Persons("Lia",18);
	 Persons p3 = new Persons("Asraf", 17);
	 Persons p4 = new Persons("Lia", 17);
	 Persons p5 = new Persons("Karla", 17);
	 System.out.println(p1.compareTo(p2));
	 System.out.println(p2.compareTo(p3));
	 System.out.println(p3.compareTo(p1));
	 System.out.println(p4.compareTo(p3));
	 System.out.println(p4.compareTo(p5));
 }


}