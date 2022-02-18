package vergil;

import java.util.Scanner;

public class Bt1 {  public static void main(String[]args) {
	Scanner scanner =new Scanner (System.in);
	byte a =scanner.nextByte();
	byte b=scanner.nextByte();
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	System.out.println(Math.pow(a, b));
}
}
