import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {
		int rem, rev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number Do you want to reverse ");
		int num = s.nextInt();
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reverse Number is " + rev);

	}

}
