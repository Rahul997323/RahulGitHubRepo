package day5;

public class SumOfTheDigit1234 {

	public static void main(String[] args) {
		
		int num=1234; int count=0; int sum;
		
		for(num=1234; num!=0; num=num/10)
		{
			sum=num%10;
			num=sum+count;
			
			System.out.println(num);
		}
		

	}

}
