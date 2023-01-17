package oops;

public class Dogs
{
	 private String name;
	 public Dogs(String name)
	 {
		 this.name = name;
		 setName(name);
	 }
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other)
	
	 {
		 if(this == other) {
			 return true;
		 }else {
			 return false;
		 }
		
	 }
	 public static void main(String[] args)
	 {
		 Dogs d1 = new Dogs("Rufus");
		 Dogs d2 = new Dogs("Sally");
		 Dogs d3 = new Dogs("Rufus");
		 Dogs d4 = d3;
		 System.out.println(d1.equals(d2));
		 System.out.println(d2.equals(d3));
		 System.out.println(d1.equals(d3));
		 System.out.println(d3.equals(d4));
	 }
}