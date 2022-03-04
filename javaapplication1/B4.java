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
public class B4 { public static void main(String[] args) {
    Scanner scanner=new Scanner (System.in);
    try {int a=scanner.nextInt();
     switch (a) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default:System.out.println("nhap tu 1-7"); 
     }
    }
catch(Exception e) { System.out.println("nhap so");
  
}
}

}
    

