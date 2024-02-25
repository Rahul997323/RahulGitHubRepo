package day9;

public class Greetings {

	public static void main(String[] args)
	{
		Greeting gr=new Greeting();
		gr.greeting1();
		String str=gr.greeting2();
		System.out.println(str);
		gr.greeting3("Rahul");
		gr.greeting4("ram");
		String str1=gr.greeting4("ram");
		System.out.println(str1);
		
	}
}
