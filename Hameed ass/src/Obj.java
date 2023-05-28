
public class Obj {

	int a;
	String b;

	Obj(int a, String b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	Obj(Obj o) {
		this.a = o.a;
		this.b = o.b;
	}

	public static void main(String[] args) {
		Obj o1 = new Obj(10, "abc");
		Obj o2 = new Obj(o1);

		System.out.println(o2.a+"\n"+o2.b);
	}

}
