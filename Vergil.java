package vergil;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Vergil {
   public static void main(String[]args) {
	Scanner scanner =new Scanner (System.in);
	System.out.println("nhap ban kinh:");
	double r;
	double pi=3.14;
	
	  try
	    { 
	      r = scanner.nextDouble();   
	      double a=r*2*pi;
	      System.out.println("chu vi hinh tron co ban kinh "+r +" la "+ a);
	    } 
	    catch ( Exception e )
	    { 
	      System.out.println("Nhap so" );
	   
	    } 
	 
   }
   }