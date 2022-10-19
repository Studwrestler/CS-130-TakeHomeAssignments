package chapter4;

import java.util.Scanner;

public class DigitAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nuumber");
		int n=scan.nextInt();
		int p=n;
		int f = 0;
		int l = 0;
		l = n%10;
		
		{	
		do {
			f = n%10;
			n /= 10;
		}while(n!=0);
		if(p>9)
			System.out.println("The total sum is: "+ (f + l));
		else
			System.out.println("The number isn't long enough: "+ f);
	

	}
}
}