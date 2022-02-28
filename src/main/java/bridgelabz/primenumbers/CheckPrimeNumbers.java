package bridgelabz.primenumbers;

import java.util.Scanner;

public class CheckPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check prime or not : ");
		int num = sc.nextInt();

		int count = 1;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}

}
