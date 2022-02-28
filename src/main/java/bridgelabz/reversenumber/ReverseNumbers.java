package bridgelabz.reversenumber;

import java.util.Scanner;

public class ReverseNumbers {
	public static void checkReverseNum(int number) {

		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		num = sc.nextInt();
		System.out.println("Given number is: " + num);
		checkReverseNum(num);
	}

}
