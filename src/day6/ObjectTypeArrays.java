package day6;

public class ObjectTypeArrays {

	public static void main(String[] args) {
		
		Object a[]= new Object[5];
		a[0]=10;
		a[1]=10.5;
		a[2]="welcome";
		a[3]=100;
		a[4]=1000;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
