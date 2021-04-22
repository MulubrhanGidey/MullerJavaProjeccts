package day2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
		if (age < 18) {

			System.out.println("you are not eigible to vote ");
		}

		else if (age >= 18 && age <= 80) {
			System.out.println(" you are eligble to vote ");

		} 
		else {

			System.out.println("You are to old to vote ");
			input.close();
	}
}
}