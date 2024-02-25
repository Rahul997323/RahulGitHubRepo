package day15;

import java.util.ArrayList;

//can accept duplicate value
//ArrayList, LinkList, Vector--Implementing List Interface
//Array has fixed size but ArrayList can grow dynamically
//You can access and insert any value in any index

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<String>();
		
        a.add("Rahul");
        a.add("Java");
        
        System.out.println(a);
        a.add(0, "Student");
       System.out.println(a);
       
       a.add(3, "ram");
       System.out.println(a);
       
       a.remove("ram");
       System.out.println(a);
       
       System.out.println(a.get(2));
       System.out.println(a.contains("Java"));
       System.out.println(a.indexOf("Rahul"));
       System.out.println(a.isEmpty());
       System.out.println(a.size());
       
       
      
	}

}
