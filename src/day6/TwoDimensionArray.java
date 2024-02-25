package day6;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		//int a[][]= new int[3][2];
		
		
     int a[][]= { {100,200},
                  {300,400},
                  {500,600}
                  };
    /* 
     System.out.println(a.length);
     System.out.println(a[0].length);
     System.out.println(a[2][0]);    */
		
		for(int r=0; r<a.length; r++)
		{
			for(int c=0; c<a[r].length; c++)
			{
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
	}

}
