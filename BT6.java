package BT;
import java.util.Scanner;
public class BT6 {



public static void main (String[]args) {
		 double a, b,c,x1,x2, delta;
		 Scanner scanner = new Scanner(System.in);
		 try {a=scanner.nextDouble();
		 b=scanner.nextDouble();
		 c=scanner.nextDouble();
		 
				 
				 if (a==0) {if (b==0) {if (c == 0) 
		        System.out.println("Pt co vo so nghiem");
	 }
		    else if(b==0&c!=0) { System.out.println("Pt vo nghiem");
		    } 	
		    else { System.out.println("pt co nghiem x= "+(-b/a));
		    }
		 }
				 delta = Math.pow(b, 2) - 4 * a * c;
				  if (delta < 0) {
			            System.out.println("pt vo nghiem");
			        } else if (delta == 0) {
			            x1 = -b / (2 * a);
			            System.out.println("pt co 1 nghiem x1 = x2 = " + x1);
			        } else {
			            x1 = (-b + Math.sqrt(delta)) / (2 * a);
			            x2 = (-b - Math.sqrt(delta)) / (2 * a);
			            System.out.println("x1 = " + x1 + " và x2 = " + x2);
			        }
		 }
		 
			 catch ( Exception e ){System.out.println("nhap so");
		 }
		
	 
	 }
}





