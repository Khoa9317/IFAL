package vergil;

import java.util.Scanner;

public class PT {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		double a;
		double b;
		try {a=scanner.nextDouble();
		b=scanner.nextDouble();
		 if (a == 0) {
			    if (b == 0) 
			        System.out.println("Pt co vo so nghiem");
		 }
			    else if(a==0&b!=0) { System.out.println("Pt vo nghiem");
			    } 	
			    else { System.out.println("pt co nghiem x= "+(-b/a));
			    }
		
		}
		 catch ( Exception e ){System.out.println("nhap so");
		 }
		 
		
			

	    }
		}
	

