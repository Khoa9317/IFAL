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
public class B4 {public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
            long a=sc.nextLong();
            int count=0;
            while (a!=0){
            a=a/10;
                 count++;   
                    }
            System.out.println(count);
 }
        
}
