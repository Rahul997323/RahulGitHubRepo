package day7;

public class StringCompersions {

	public static void main(String[] args) {
		
		//Case-1
		/*
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		//Case-2
		/*
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		
		//Case-3
		
		
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		

	}

}
