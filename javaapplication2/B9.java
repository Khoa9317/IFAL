/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

public class B9 {public static void main(String[] args) {

   Scanner sc=new Scanner(System.in); 
   try{
   int num=sc.nextInt();
   int reversed=0;
    
    System.out.println("Original Number: " + num);

    
    while(num != 0) {
    
      
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  
}
catch (Exception e){
    System.out.println("nhap sai");
}
}
}

    

