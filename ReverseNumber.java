package chapter4;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int i = 0;
		while(n!=0) {
			int d = n%10;
			i = i*10+d;
			n /= 10;
			
			}
			System.out.println("Reversed Number: "+ i);
		}
	
		

	}

