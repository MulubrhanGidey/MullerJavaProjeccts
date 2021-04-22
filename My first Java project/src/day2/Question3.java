package day2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		double number = input.nextDouble();
		if (number > 0)

			System.out.println("It is potiive ");

		else if (number < 0) {
			System.out.println("Nember is negative");
			
		} else
			System.out.println("invalid Entry");
			
		input.close();
	}
}
