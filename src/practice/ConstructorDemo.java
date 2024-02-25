package practice;

public class ConstructorDemo {
         int a;
         int b;
         String s="Welcome";
         
         ConstructorDemo()
         {
        	 a=100;
        	 b=200;
        	 s="welcome";
         }
         
         void display()
         {
        	 System.out.println(a);
        	 System.out.println(b);
        	 System.out.println(s);
         }
  
         public static void main(String [] args)
         {
        	 ConstructorDemo cd=new ConstructorDemo();
        			 
         	 cd.display(); 
         }
}
        
