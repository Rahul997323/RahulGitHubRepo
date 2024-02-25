package day5;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234; int reverse=0;
		
		for(num=1234;num!=0; num=num/10)
		{
			int reminder=num%10;
			reverse= reverse*10+reminder;
		}
   System.out.println("REverse Number is:"+reverse);
	}

}
