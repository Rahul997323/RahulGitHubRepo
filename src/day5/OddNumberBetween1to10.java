package day5;

public class OddNumberBetween1to10 {

	public static void main(String[] args) {

/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			
			i=i+2;
		}
*/
		int i=1;
		while(i<=10)
		{
			if(i%2==1)
				System.out.println(i);
			i=i+1;
		}
		
	}

}
