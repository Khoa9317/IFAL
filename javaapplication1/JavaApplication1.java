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
public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println("nhap so");
        int a;
        Scanner scanner=new Scanner (System.in);
        try { a=scanner.nextInt();
         if (a>0){
             System.out.println("positive");}
             else {System.out.println("negative");
                     } 
         if (a==0){
             System.out.println("zero");
            
         }
                 
  
}
catch(Exception e) {
  
}
    }
    
}
