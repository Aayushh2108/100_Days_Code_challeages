package Ayush;
import java.util.Scanner;
//public class GreaterNo {
//
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		// Find Three Greatest Number
//		if (a>b && a>c) {
//			System.out.println("a is greater no.");
//		}
//		else if (b>a && b>c) {
//			System.out.println("b is greater no.");
//		}
//		else {
//			System.out.println("c is greater no.");
//		}
//
//	}
//
//}
// By taking input from user 

public class GreaterNo{
	public static void main(String[] args) {
		System.out.println("Taking Input from User");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a =sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int b =sc.nextInt();

		System.out.println("Enter the Third Number");
		int c =sc.nextInt();
		 
		if (a>b && a>c) {
			System.out.println("a is greater no.");
		}
		else if (b>a && b>c) {
			System.out.println("b is greater no.");
		}
		else {
			System.out.println("c is greater no.");
		}
		
	}
}
