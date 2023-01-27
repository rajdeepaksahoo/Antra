package day2.ImmutableClass;
class A{
	int noo=10;
}
public final class ImmutableClass {
	private final String member1 ;
	private final String member2 ;
	private final A no ;
	
	public ImmutableClass(String member1, String member2, A no) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		A aa = new A();
		aa.noo=100;
		this.no=aa;
	}

	
	public A getNo() {
		return no;
	}

	public String getMember1() {
		return member1;
	}

	public String getMember2() {
		return member2;
	}
	 public static void main(String... args) {
		 A a = new A() ;
		 ImmutableClass ic = new ImmutableClass("Raz","Enu",a);
		 System.out.println(ic.member1 +ic.member2+"  " + ic.no.noo);
	 }
}
