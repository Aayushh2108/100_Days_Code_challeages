 package Maths;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
	    int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number do you want to print table ");
		int num=s.nextInt();
		for( i=1; i<=10;i++){
			
			System.out.println(num+" * " +i+ "="+num*i);
		}
	}

}
