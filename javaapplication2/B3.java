/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;


public class B3 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
    int a=sc.nextInt();
    int temp=0;
    for (int i=0;i<=a;i++){
        temp=temp+i;
        
    }
     System.out.println(temp);
}
    catch (Exception e){
        System.out.println("nhap sai");
    }}
}
