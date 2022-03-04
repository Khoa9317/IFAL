/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;


public class B5 {    public static void main(String[] args){
    Scanner scanner=new Scanner (System.in);
    try {float a=scanner.nextFloat();
    float b=scanner.nextFloat();
a = Math.round(a* 1000);
a=a/1000;
b=  Math.round(b* 1000);
b=b/1000;
if (a==b){System.out.println("Same");
}
else {System.out.println("Different");
}
}
catch(Exception e) {System.out.println("Nhap so");
}
    
}
}
