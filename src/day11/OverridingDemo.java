package day11;

class Bank
{
	double roi()
	{
	return 0.0;
    }
}

class ICICI extends Bank
{
	double roi()
	{
	return 10.5;
    }
}

class Axis extends Bank
{
	double roi()
	{
	return 11.5;
    }
}



public class OverridingDemo {

	public static void main(String[] args) {
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		Axis ax=new Axis();
		System.out.println(ax.roi());
		
		Bank bk=new Bank();
		System.out.println(bk.roi());

	}

}
