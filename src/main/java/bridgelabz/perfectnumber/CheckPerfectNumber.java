package bridgelabz.perfectnumber;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer number: ");
		int num = sc.nextInt();
		
		int sum = 1;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == num)
			System.out.println(num + " is Perfect Number");
		else
			System.out.println(num + " is Not Perfect Number");

	}

}
