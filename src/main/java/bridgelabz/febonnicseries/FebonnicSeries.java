package bridgelabz.febonnicseries;

import java.util.Scanner;

public class FebonnicSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int enter = sc.nextInt();
		System.out.println("Febonnic Series of " + enter + " is: ");

		int a = 0, b = 1;

		if (enter >= 1) {
			System.out.println("0 ");
		}

		for (int i = 3; i <= enter; i++) {
			int c = b + a;
			b = a;
			a = c;
			System.out.println(c + " ");
		}

	}

}
