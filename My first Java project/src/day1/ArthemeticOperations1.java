package day1;

public class ArthemeticOperations1 {

	public static void main(String[] args) {
		int num1 = -5; int num2 = 8; int num3 = 6;
		int num4 = num1 + num2 * num3;
		System.out.println("The result is  "  + num4 );
		int a = 55; int b = 9; int c = 9;
		int d = (a + b) % c;
		System.out.println("The result of " + (a + " + " + b) + " % " +  c + " = " + d );
		int e = 20; int f = -3; int g = 5; int h = 8;
		int i = e + f * g / h;
		System.out.println("The result is " + i );
		int j = 5; int k = 15; int l = 3; int m = 2; int n = 8; int o = 3;
		int p = j + k / l * m - n % o;
		System.out.println("The result is " + p );
	}

}
