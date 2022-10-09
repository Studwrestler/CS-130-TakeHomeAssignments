package chapter4;

import java.util.Scanner;

public class HowManyDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		if(n<10&&n>0)
			System.out.println("The number is one digit");
		else if(n>=10 && n<100)
			System.out.println("The number is two digits");
		else if(n>=100 && n<1000)
			System.out.println("The number is three digits");
		else if(n>=1000 && n<10000)
			System.out.println("The number is four digits");
		else if(n>=10000 && n <100000)
			System.out.println("The number is five digits");
		else
			System.out.println("The number is not between 1 and 99999");
		

	}

}
