package day6;

import java.util.Arrays;

public class SingleDimArrays {

	public static void main(String[] args) {
		
		//Approach---1 //Declaration the array
		
		/* int a[]= new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
	
      //Approach--2 //insert value into the array
		
		int a[]= {100,200,300,400,500,600,700};
		
		System.out.println(a.length);  //Find size of an array
		
		System.out.println(a[3]);   //get single value from an array
		
		System.out.println(Arrays.toString(a)); //get all value from array
		
		for(int i=0; i<=6 ; i++)
		{
			System.out.println(a[i]);  //read multiple value from an array
		}
		
		for( int x:a)   //for each loop
		{
			System.out.println(x);
		}
	}

}
