package day13;

public class DataConversion {

	public static void main(String[] args) {
		

		//String--int
		
		//String s="welcome" //not possible to convert to number
		
		String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println(s1+s2);
		
		//String--double
		
		String s3="10.5";
		String s4="11.5";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		
		//String--boolean
		
		String s5="true";
		String s6="false";
		
		System.out.println(Boolean.parseBoolean(s5));
		
		
		//int,double,char,boolean--String
		
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		
		
		
		
		
		
	}

}
