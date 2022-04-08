package lthdt2;

public class taxmanagement {

	public static void main(String[] args) {
	 Student s= new Student();
	 Worker w= new Worker();
	 BusinessPerson b= new BusinessPerson();
	
	
	System.out.println(s.payTax(22, "4", "3"));
	System.out.println(w.payTax(22, "4", "3"));
	System.out.println(b.payTax(51, "4", "3"));
	}

}
