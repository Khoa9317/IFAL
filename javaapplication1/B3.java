/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class B3 {
     public static void main(String[] args) {
         float a;
         try {  Scanner scanner=new Scanner (System.in);
         a=scanner.nextFloat();
         if (a==0) {
             System.out.println("zero");         
         }
         if (a>0){
             System.out.println("positive");
         }
         else {
             System.out.println("negative");
            if (Math.abs(a)>100000){
             System.out.println("large");
         }if (Math.abs(a)<1){
             System.out.println("small");
         }
         }
         
}
catch(Exception e) {System.out.println("nhap so");
  
}
     }
    
}
