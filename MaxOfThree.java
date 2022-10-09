package chapter4;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2,n3, max = 0;
		System.out.println("Enter three integers: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		if(n1>n2 && n1>n3)
			max = n1;
		else if(n2>n3)
			max = n2;
		else
			max = n3;
		System.out.println("The maximun is: "+ max);
		
	}

}
