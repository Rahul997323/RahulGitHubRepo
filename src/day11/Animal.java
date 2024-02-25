package day11;

public class Animal{
	String color= "White";
	void eat()
	{
		System.out.println("eating");
	}
		
	}

class Dog extends Animal
{
	String color= "black";
	void display()
	{
		System.out.println(super.color);
	}
	void eat() 
	{
		System.out.println("dog is eating");
		super.eat();
		
	}
	
	}

