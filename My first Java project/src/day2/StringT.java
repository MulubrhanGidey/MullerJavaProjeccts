package day2;

import java.util.Scanner;

public class StringT {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//String name = "Teklu";
		String letter = "T";
		System.out.println("Enter a letter: ");
	    String letter2 = input.nextLine();
		if(letter2.startsWith(letter)) {
		
			System.out.println("Valid letter: ");
			}
		
		else {
	}
			System.out.println("Invalid letter: ");
			input.close();
		}
}

