package Ayush;
import java.util.Scanner;

public class UserInput {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = s.next();
		//next() is used for String 
		System.out.println("Enter your Age");
		int age = s.nextInt();
		
		System.out.println("Enter your Gender");
		char gender = s.next().charAt(0);
		//charAt(0) means character at zero index to print
		
		System.out.println("Enter your Phone Number");
		long phone = s.nextLong();
		System.out.println("....................................................");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Phone No ::"+phone);
		
	}

}
