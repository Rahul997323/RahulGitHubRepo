package day10;

public class Accounts {

	public static void main(String[] args) {
		
		Account accobj=new Account();
		
		accobj.setAccno(123);
		accobj.setAMount(1000);
		accobj.setName("Rahul");
		
		System.out.println(accobj.getAccno());
		System.out.println(accobj.getAmount());
		System.out.println(accobj.getName());

	}

}
