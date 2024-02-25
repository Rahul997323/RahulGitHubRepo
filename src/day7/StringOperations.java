package day7;

public class StringOperations {

	public static void main(String[] args) {
		
		String s="welcome";
		
		 String s1=new String("welcome");
		System.out.println(s1);
		
		//length--return length of the string
		
		System.out.println(s.length());
		
		//concate joining string
		
		String s2="welcome";
		String s3="to Home";
		String s4= "baby";
		System.out.println(s2+s3+s4);
		System.out.println(s2.concat(s3).concat(s4));
		
		
		//trim()  remove left & right side space
		String s5="    Automation     ";
		System.out.println(s5);
		System.out.println(s5.length());
		System.out.println(s5.trim());
		System.out.println(s5.trim().length());
		
		//charAt()- return a single char of index we passed
		
		String s6= "welcome";

		System.out.println(s6.charAt(0));
		System.out.println(s6.charAt(1));
		System.out.println(s6.charAt(2));
		System.out.println(s6.charAt(3));
		System.out.println(s6.charAt(4));
		System.out.println(s6.charAt(5));
		System.out.println(s6.charAt(6));
		
		
		System.out.println(s6.contains("wel"));
		System.out.println(s6.contains("Wel"));
		System.out.println(s6.contains("come"));
		
		
		// equals,    compare-equalsIgnoreCase()--compare 2 string
		// return boolean value
		
		
		String s7="welcome";
		String s8="Welcome";
		System.out.println(s7.equals(s8));
		System.out.println(s7.equalsIgnoreCase(s8));
		
		//replace()- replace single/multiple character in a string
		
		String s10= "Welcome to Selenium Automation Testing Selenium Training";
		
		System.out.println(s10.replace('e','x'));
		System.out.println(s10.replace("Selenium", "Java"));
		
		//substring()--to extract substring to main string
		
		String s11= "Welcome";
		System.out.println(s11.substring(0, 6));
		System.out.println(s11.substring(0,4));
		System.out.println(s11.substring(0));
		System.out.println(s11.substring(1));
		
		//split--divide the string into multiple parts using delimeter
		
		String s12="rahul123@gmail.com";
		String a[]= s12.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String s13="rahul123@ gmail.com";
		String a1[]= s13.split(" ");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		
		//touppercase()    //tolowercase()
		String s14="welcome";
		System.out.println(s14);
		System.out.println(s14.toUpperCase());
		System.out.println(s14.toLowerCase());
		
		
	}
	

}
