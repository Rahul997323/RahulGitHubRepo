package day5;

public class PalimdromNumber {

	public static void main(String[] args) {
int num=121; int palindrom=0;
		
		for(num=121;num!=0; num=num/10)
		{
			int reminder=num%10;
			palindrom= palindrom*10+reminder;
		
   System.out.println("Palindrom Number is:"+palindrom);
		}
		
	}

}
