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
public class B2 { 
    public static void main(String[] args) {
        int a,b,c,t;
        System.out.println("nhap 3 so");
        Scanner scanner=new Scanner (System.in);
 
try { a=scanner.nextInt();
b=scanner.nextInt();
c=scanner.nextInt();
if (a>b){
    t=a;
}else {t=b;
}
if (t>c){
 t=t;}
else {t=c;
}
 System.out.println(t);
}
catch(Exception e) {System.out.println("nhap so");
 
}    
    
    }
    
}
