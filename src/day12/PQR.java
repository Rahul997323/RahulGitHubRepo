package day12;

public class PQR extends MNO implements ABC,XYZ{

	public void m1() {
		System.out.println("This is m1 from ABC");
		System.out.println(x);
		
	}
	public void m2() {
		System.out.println("this is m2 from XYZ");
		System.out.println(y);
	}

	
	
	public void m3()
	{
		System.out.println("This is m3 from MNO");
		System.out.println(z);
	}

	public static void main(String[] args) {
		
       PQR p=new PQR();
        p.m1();
        p.m2();
        p.m3();
	}

	
}
