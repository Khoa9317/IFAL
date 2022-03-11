package vergil;

import java.util.Scanner;

public class Ham {public static void main (String[]args) {
	Scanner scanner=new Scanner(System.in);
	try {System.out.println("nhap n");
	int n=scanner.nextInt();
	scanner.nextLine();
	System.out.println("nhap s");
	String s=scanner.nextLine();
	
	for (int i=0;i<n;i++) {
		nhap(s);
	}
	boolean kt=true;
	while (kt==true) {
	System.out.println("pt bac 1 hay 2");
		
		
	int pt=scanner.nextInt();
	scanner.nextLine();
	
	 
	if (pt==1) { 
		System.out.println("nhap a");
		double a=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("nhap b");
	double b=scanner.nextDouble();
	scanner.nextLine();
	ptbac1(a,b);

	
	}
	else { 
		System.out.println("nhap a");
		double a=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("nhap b");
	double b=scanner.nextDouble();
	scanner.nextLine();
	System.out.println("nhap c");
	
	double c=scanner.nextDouble();
	scanner.nextLine();
	if (a==0) {
		ptbac1(b,c);
	}
	else {
	ptbac2(a,b,c);
	
	
	}
	
	}
	System.out.println("bam 1 de tiep tuc 0 de ket thuc");
	int tt=scanner.nextInt();
	scanner.nextLine();

	if (tt==1) {
		kt =true;
	}
	else {
		kt=false;
	}
	}
	}
	catch (Exception e) {
		System.out.println("nhap lai");
	}
}
public static void Hello() {
	System.out.println("Lap trinh Java 2021");
}
public static void nhap(String s) {
	System.out.println(s);
}
public static void ptbac1(double a,double b) {
	 if (a == 0) {
		    if (b == 0) {
		        System.out.println("Pt co vo so nghiem");
		    }
		    else { 
		    	System.out.println("PT vo nghiem");
		    	}
		    
		    }
	 else { 
		 System.out.println("pt co nghiem x= "+(-b/a));
		 
	 }
}
public static void ptbac2 (double a,double b,double c) {
	

	  if (Math.pow(b, 2) - 4 * a * c < 0) {
           System.out.println("pt vo nghiem");
       } else if (Math.pow(b, 2) - 4 * a * c == 0) {
          
           System.out.println("pt co 1 nghiem x1 = x2 = " +-b / (2 * a));
       } else {
          
           System.out.println("x1 = " + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) + " và x2 = " + (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
}
}
}




