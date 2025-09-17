
public class MethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodClass a = new MethodClass();
		String b = a.getdata();
		System.out.println(b);
		System.out.println("===============================");
		MethodClass2 c = new MethodClass2();
		c.getdata2();
		System.out.println("===============================");
		getdata3();
	}

	public String getdata() {
		System.out.println("Hello world");
		return "Good morning";
	}

	public static String getdata3() {
		System.out.println("Hello world");
		return "Good morning";
	}

}
