/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

public class B2 {public static void main(String[] args){




 
  Scanner sc = new Scanner(System.in);

        System.out.println("row");

        int rows = sc.nextInt();

    

        for (int i = 1; i <= rows; i++) 

        { 

           for(int j=rows;j>=i;j--)

            {

               System.out.print(j);

            }

            System.out.println();

        }
}
}




       

    


