/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class B6 { public static void main (String[]args)
   {Scanner sc = new Scanner(System.in);

     int lower = sc.nextInt(),
             upper = sc.nextInt();


     for (int i = lower; i <= upper; i++)
       if (isPrime (i))
 	  System.out.print (i);
   }

   static boolean isPrime (int n)
   { int count = 0;
     

  
     if (n < 2)
       return false;

     
     for (int i = 2; i < Math.sqrt (n); i++)
       {
 	if (n % i == 0){
            count++;}
 	  if(count>2)return false;
       }

     
     return true;
   }
 }

