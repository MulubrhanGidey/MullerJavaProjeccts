package day2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		int firstnumber = input.nextInt();
		System.out.println("Enter scond number ");
		int secondnumber = input.nextInt();
		int sum = firstnumber + secondnumber;
		System.out.println("The sum " + sum);
		int dif = firstnumber - secondnumber;
		System.out.println("Thd difference " + dif);
	} 

}
