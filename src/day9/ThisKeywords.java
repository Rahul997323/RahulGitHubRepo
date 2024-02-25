package day9;

public class ThisKeywords {

		
		int x,y;
		
		ThisKeywords(int x,int y)
		{
			this.x=x;
			this.y=y;
			
			
		}
	
void display()
{
	System.out.println(x);
	System.out.println(y);
}

public static void main(String[] args)
{
ThisKeywords tk=new ThisKeywords(10,20);
tk.display();
}

	}
