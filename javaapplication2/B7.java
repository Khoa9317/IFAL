/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Lab
 */
public class B7 {public static void main (String[]args){int temp=1;
    int n = 10, firstTerm = 0, secondTerm = 1;

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

    
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
}
    
}
}
